package com.tech.apps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CDCIController {

	@RequestMapping(value = "/jenkins",method = RequestMethod.GET)
	public String welcomeJenkise() {
		return "Jenkins CD/CI PipeLine";
	}
}
