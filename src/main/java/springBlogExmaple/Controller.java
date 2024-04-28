package springBlogExmaple;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home/test1")
    public void home() {
        System.out.println(" home ");
    }

    @GetMapping("/hello/test1")
    public void hello() {
        System.out.println(" Hello ");
    }

    @GetMapping("/test/test1")
    public void test() {
        System.out.println(" TEST ");
    }

//    @PostMapping("/loginError")
//    public String loginerror(LoginForm loginForm, BindingResult bindingResult){
//        return "loginForm";
//    }

}
