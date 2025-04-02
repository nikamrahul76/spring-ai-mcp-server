package com.rn.study.ai.mcpserver.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DocumentService {

    @Tool(description = "Upload a file")
    public Mono<String> uploadDocuments(String fileName) {
        return Mono.just("Uploaded: " + fileName);
    }
}
