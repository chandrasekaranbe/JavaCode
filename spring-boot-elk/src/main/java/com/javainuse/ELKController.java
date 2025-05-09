package com.javainuse;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class ELKController {
	private static final Logger LOG = LogManager.getLogger(ELKController.class);

	@RequestMapping(value = "/elk")
	public String helloWorld() {
		String response = "Welcome to javainuse" + new Date();
		LOG.log(Level.INFO, response);

		return response;
	}

	@RequestMapping(value = "/exception")
	public String exception() {
		String response = "";
		try {
			throw new Exception("Opps Exception raised....");
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error(e);

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stackTrace = sw.toString();
			LOG.error("Exception - " + stackTrace);
			response = stackTrace;
		}

		return response;
	}
	
}
