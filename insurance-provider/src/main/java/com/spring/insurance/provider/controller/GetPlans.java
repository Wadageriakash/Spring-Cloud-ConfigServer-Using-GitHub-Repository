package com.spring.insurance.provider.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("insurance-provider")
public class GetPlans {

	@GetMapping("/getAllPlans")
	public List<String> getPlans(){
		return Stream.of("Premium", "Gold", "Platinum").collect(Collectors.toList());
	}
}
