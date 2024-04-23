package com.dsystems.ProjectAlpha.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ServerController {

    @GetMapping("/home")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from Server: 1");
        return response;
    }

    @GetMapping("/heartbeat")
    public Map<String, String> heartbeat() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "OK");
        return response;
    }
}
