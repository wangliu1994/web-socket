package com.winnie.websocket.controller;

import com.winnie.websocket.WebSocketServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/6/30
 * @desc
 */
@RestController
@RequestMapping("/webSocket")
public class WebSocketController {

    @Resource
    private WebSocketServer webSocketServer;

    @GetMapping("/send")
    public void sendMessage1(String data, String userId) throws IOException {
        WebSocketServer.sendInfo(data, userId);
    }
}
