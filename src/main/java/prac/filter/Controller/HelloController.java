package prac.filter.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filter")
public class HelloController {

    @GetMapping("/{hello-message}")
    public ResponseEntity printHello(@PathVariable("hello-message") String hello){
        System.out.println(hello);
        return new ResponseEntity(HttpStatus.OK);
    }
}
