package TodoApplication.TodoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String helloWorld() {
        return "to-do Application !";
    }
}
