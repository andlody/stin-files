package {{package}}.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping(path = {"version","health"}, produces= MediaType.APPLICATION_JSON_VALUE)
    public String version(){
        return "{\"version\":\"{{version}}\",\"name\":\"{{name}}\",\"builded\":\"{{builded}}\"}";
    }
}
