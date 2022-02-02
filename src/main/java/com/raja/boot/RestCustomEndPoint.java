/**
 * 
 */
package com.raja.boot;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author RajaReddy
 *
 */
@Component
@RestControllerEndpoint(id = "active")
public class RestCustomEndPoint {

	@Autowired
	private ActiveSessionCounter activeSessionCounter;

	@GetMapping("/sessions")
	public ResponseEntity<Object> customEndPoint() {
		Map<String, Object> dataMap = new ConcurrentHashMap<>();
		dataMap.put("Active Sessions Count", activeSessionCounter);
		return new ResponseEntity<>(dataMap, HttpStatus.OK);
	}
}
