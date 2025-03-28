package br.com.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AiController {

	 @GetMapping("/")
	 public String ajudaai() {
	        return "ajudaai";
	 }
}
