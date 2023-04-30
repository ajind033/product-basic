package com.example.productbasic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	private final static String COMMON_LOG = "ProductController.";

	@GetMapping
	public ResponseEntity<Map<String, String>> getProductDetail(@RequestParam(name = "id") String id) {
		log.info("{}getProductDetail started with id ::{}", COMMON_LOG, id);
		Map<String, String> productMap = new HashMap<>();
		productMap.put("id", id);
		return new ResponseEntity<>(productMap, HttpStatus.OK);
	}
}
