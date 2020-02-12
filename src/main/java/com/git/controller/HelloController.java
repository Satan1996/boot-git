package com.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/131:09
 * @Version 1.0
 */
@RestController
public class HelloController {
	@RequestMapping("info")
	public String info(){
		return "Hello SpringBoot Info";
	}
	//开发人员写了一句话
}
