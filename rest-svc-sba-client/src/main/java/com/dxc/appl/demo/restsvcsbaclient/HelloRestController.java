package com.dxc.appl.demo.restsvcsbaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping(path="/hello")
	public String hello() {
		return "Hello!";
	}
}
