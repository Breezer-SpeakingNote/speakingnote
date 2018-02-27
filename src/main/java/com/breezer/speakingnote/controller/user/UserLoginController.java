package com.breezer.speakingnote.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserLoginController")
@RequestMapping("/user")
public class UserLoginController {

	@RequestMapping({"", "/", "loginpage"})
	public String Main() {
		System.out.println("====== UserMainController : loginpage ======");
		return "user/loginpage";
	}
}
