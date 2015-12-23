/**
* @author bey0ndz
* All rights reserved, BeyondTraining.
*/
package com.beyondtraining.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultPageController {
	public static final Logger logger = LoggerFactory.getLogger(DefaultPageController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String defaultPageUI() {
		return "defaultpage";
	}
}
