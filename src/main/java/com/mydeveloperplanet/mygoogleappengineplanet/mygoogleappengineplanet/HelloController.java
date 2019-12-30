package com.mydeveloperplanet.mygoogleappengineplanet.mygoogleappengineplanet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController{

    @GetMapping("/hello")
    public String hello() {
        StringBuilder message = new StringBuilder("Hello From standardenvironmentpp!");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
    
    @GetMapping("/indexPage")
    public String getMessage() {
    	StringBuilder message = new StringBuilder("Hello from from spring boot application");
    	try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }

}
