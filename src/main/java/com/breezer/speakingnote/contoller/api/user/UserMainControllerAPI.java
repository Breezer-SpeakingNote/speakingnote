package com.breezer.speakingnote.contoller.api.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserMainControllerAPI")
@RequestMapping("/api/user")
public class UserMainControllerAPI {

	@RequestMapping("/")
	public String main() {
		return "test";
	}
}
