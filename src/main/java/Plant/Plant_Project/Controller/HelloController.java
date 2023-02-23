package Plant.Plant_Project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public List<String> Hello(){
        return Arrays.asList("제발");
    }
}

