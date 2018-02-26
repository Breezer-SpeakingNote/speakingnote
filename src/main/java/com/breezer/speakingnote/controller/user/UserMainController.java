package com.breezer.speakingnote.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserMainController")
@RequestMapping("/user")
public class UserMainController {

	@RequestMapping({"", "/", "login"})
	public String Main() {
		return "user/login";
	}
}
