package br.com.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl{
	
	 private final ChatClient.Builder chatClientBuilder;

	    public AiServiceImpl(ChatClient.Builder chatClientBuilder) {
	        this.chatClientBuilder = chatClientBuilder;
	    }

	    public String run(String userPrompt) {

	        var chatClient = chatClientBuilder.build();

	        return chatClient
	                .prompt()
	                .user(userPrompt)
	                .call()
	                .content()
	                .replace("\n", "");
	    }

	
	

}
