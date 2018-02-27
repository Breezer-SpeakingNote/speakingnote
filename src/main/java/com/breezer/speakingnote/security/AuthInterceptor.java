package com.breezer.speakingnote.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.breezer.speakingnote.vo.UserVo;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(
		HttpServletRequest request, 
		HttpServletResponse response, 
		Object handler)
		throws Exception {
		
		System.out.println("====== AuthInterceptor ======");
		
		//1. hanlder 종류 확인
		if( handler instanceof HandlerMethod == false ) {
			System.out.println("handler is not instanceof HandlerMethod -> pass");
			return true;
		}
		
		//2. casting
		HandlerMethod handlerMethod = (HandlerMethod)handler;
		
		//3. Method @Auth 받아오기
		Auth auth = 
			handlerMethod.getMethodAnnotation( Auth.class );
		
		//4. Method에 @Auth 가 없다면,
		//   Class(Type)에 붙에 있는 @Auth 받아오기
		if( auth == null ) {
			auth = handlerMethod.
				   getMethod().
			       getDeclaringClass().
			       getAnnotation(Auth.class);
		}
		
		//5. @Auth가 안붙어 있는 경우
		if( auth == null ) {
			System.out.println("@Auth is not exist -> pass");
			return true;
		}
		
		//5. @Auth가 붙어 있기 인증여부 체크
		HttpSession session = request.getSession();
		
		if( session == null ) { // 인증이 안되어 있음
			System.out.println("authentication fail -> session is null ");
			response.sendRedirect( request.getContextPath() + "/login" );
			return false;
		}
		
		UserVo authUser = (UserVo)session.getAttribute("authUser");
		if( authUser == null ) { // 인증이 안되어 있음
			System.out.println("authentication fail -> authUser is null ");
			response.sendRedirect( request.getContextPath() + "/login" );
			return false;
		}

		// 로그인이 정상적으로 되어있는경우 이지점까지 넘어온다.
		// request.getContextPath()
		
		//id가 존재하지 않는 경우 
		if (authUser.getId() == null) {
			System.out.println("authentication fail -> id is null");
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
		
		
		//현재 주소를 가져온다 
		String url = request.getRequestURL().toString();
		//System.out.println("url : "+url);

		// '/' 로 주소를 분리한다 
		String[] array;
		array = url.split("/");

		// 현재 세션의 id와 입력된 주소창의 id를 가져온다 
		//System.out.println("array[4] : "+array[4]);
		//System.out.println(authUser.getId());
		String urlId = array[4];

		// 현재 세션의 id와 입력된 주소창의 id가 같으면 true, 다르면 false 
		if (urlId.equals(authUser.getId())) {
			System.out.println("-> authentication success ");
			return true;
		} else {
			System.out.println("-> authentication fail ");
			response.sendRedirect(request.getContextPath() + "/" + array[4]);
			return false;
		}
		
		
	}
		
}
