# Real-Time-Chat-Application

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-brightgreen)
![WebSocket](https://img.shields.io/badge/WebSocket-Real_Time_Communication-orange)
![Lombok](https://img.shields.io/badge/Lombok-Enabled-yellow)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template_Engine-lightgreen)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-blueviolet)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ_IDEA-purple)
![GitHub](https://img.shields.io/badge/Version_Control-GitHub-black)


This is a Real-Time chat application that multiple user can enter username and send messages within the same group chat.  

## Technologies and Tools Backend
- Spring Boot
- Spring Web
- Spring Messaging(STOMP Protocol)
- WebSocket
- LOMBOK
- IntelliJ 
- Maven


## Frontend
- Thymeleaf 
- JavaScript(ES6)
- SockJS Stomp.js HTML/Bootstrap CSS

## Steps Taken
1. Created Spring Boot project and added appropriate dependency
2. Created WebSocket class implementing WebSocketMessageBrokerConfigure. Add 2 methods registerStompEndpoints and configureWebSocketTransport. Set @Configure and EnableWebSocketMesssageBroker annotation. 
- Message broker kind of like a middle man to direct messages.
- ResterStompEndpoints: Define the endpoint, security feature and accessible to all users. 
- ConfigureMessageBroker: I set the message broker and expect sent message
3. Added ChatMessage class and ChatController. ChatMessage is model for the chat app. ChatController for Mapping. Created sendMessage and chat methods.
4. Added chat.html Use CSS bootstrap for easer and responsive web app.
5. Added Script and a connection function. Created function showMessage and sendMessage. 

