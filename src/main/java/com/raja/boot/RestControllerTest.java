/**
 * 
 */
package com.raja.boot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author RajaReddy
 *
 */
@RestController
@Slf4j
public class RestControllerTest {

	@GetMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		log.info("welcome api started");
		HttpSession session = request.getSession(false);
		if (session == null) {
			log.info("Unable to find session. Creating a new session");
			session = request.getSession(true);
		}
		return "Hello Raja";
	}
}
