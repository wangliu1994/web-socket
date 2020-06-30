package com.winnie.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/6/24
 * @desc
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter endpointExporter(){
        return new ServerEndpointExporter();
    }
}
