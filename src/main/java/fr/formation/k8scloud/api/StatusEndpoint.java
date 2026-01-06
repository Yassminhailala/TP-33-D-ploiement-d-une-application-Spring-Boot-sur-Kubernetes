package fr.formation.k8scloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusEndpoint {

    @GetMapping("/api/info")
    public Map<String, String> getInformation() {
        return Map.of(
                "message", "K8s Cloud Service is running successfully",
                "status", "UP");
    }
}
