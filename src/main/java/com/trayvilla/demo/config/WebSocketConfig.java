/**
 * @author Rustom Trayvilla
 * @since Aug 2, 2025
 * @version 1.0
 */

package com.trayvilla.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
 * This class setup WebSocket message broker using STOMP over WebSocket
 */

@Configuration // automatically apply setup
@EnableWebSocketMessageBroker // enable websocket and stomp protocol messaging handling in Spring
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat") //websocket connection connect to /chat
                .setAllowedOrigins("http://localhost:8080") //Security feature unauthorize broadcast
                .withSockJS(); //accessible to more user
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); //subscribe to this topic will get the message
        registry.setApplicationDestinationPrefixes("/app"); // cal the method in chat controller and reroute in a topic
    }
}
