package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	@RequestMapping(value="/register/add", method={RequestMethod.POST, RequestMethod.GET})
//	@RequestMapping("/register/add")
	@GetMapping("/register/add")
	public String register() {
		return "registerForm"; // WEB-INF/views/registerForm.jsp
	}
	
//	@RequestMapping(vale="/register/save", method=RequestMethod.POST)
	@PostMapping("/register/save")
	public String save(User user, Model m) throws Exception{
		// 1. 유효성 검사
		if(!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못입력하셨습니다.", "utf-8");
			m.addAttribute("msg", msg);
			return "forward:/register/add";
//			return "redirect:/register/add?msg="+msg;
		}
		
		// 2.DB에 신규회 정보를 저장 
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return false;
	}
}
