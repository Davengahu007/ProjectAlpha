package com.dsystems.ProjectAlpha.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ServerController {

    @Value("${server.id}")
    private String serverId;

    @GetMapping("/home")
    public ResponseEntity<Map<String, String>> home() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from Server: " + serverId);
        response.put("status", "successful");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/heartbeat")
    public ResponseEntity<Void> heartbeat() {
        return ResponseEntity.ok().build();
    }
}

