package com.breezer.speakingnote.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserMainController")
@RequestMapping("/user")
public class UserMainController {

	@RequestMapping({"", "/", "loginpage"})
	public String Main() {
		System.out.println("====== UserMainController : loginpage ======");
		return "user/loginpage";
	}
}
