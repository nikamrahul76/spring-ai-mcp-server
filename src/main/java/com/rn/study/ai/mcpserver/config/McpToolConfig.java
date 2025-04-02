package com.rn.study.ai.mcpserver.config;

import com.rn.study.ai.mcpserver.service.DocumentService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpToolConfig {

    @Bean
    public ToolCallbackProvider toolProvider(DocumentService documentService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(documentService)
                .build();
    }


}
