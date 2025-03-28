package br.com.ai.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ai.service.AiServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Basic")
public class AiRestController {
	
	
	private final AiServiceImpl chatService;

    public AiRestController(AiServiceImpl chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/ai/basic/basic/generate")
    public Map generate(@RequestParam(value = "message", defaultValue = "Que foi são Dalton?") String message) {
    	
        return Map.of("ollama", chatService.run(message));
    }
    
   
   



}
