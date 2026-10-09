
package com.polyglotmesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/status")
    public Map<String, String> getStatus() {
        return Map.of(
            "project", "PolyglotMesh",
            "status", "running",
            "message", "API is working!"
        );
    }
}

