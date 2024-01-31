package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {


@Autowired
private FileDBRepository s1;
	
//	@RequestMapping("login")
//	@ResponseBody
//	public String login(student st1) {
//		s1.save(st1);
//		System.out.println("Hello Successfully login");
//		return st1.getName();
//	}
}
