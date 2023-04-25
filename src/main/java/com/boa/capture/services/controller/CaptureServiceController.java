package com.boa.capture.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/capturesvc")
@Slf4j
public class CaptureServiceController {
	
	
	@GetMapping
	public ResponseEntity<String> getCapture() {
		log.info("Invoking Capture Service Get Endpoint");
		return ResponseEntity.ok("Response Entity invoked successfully.");
	}

}
