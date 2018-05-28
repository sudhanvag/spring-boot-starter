package ic.ecx.mock.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sgnaneshwar
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String demo(){
        return "Hello World!!";
    }
}
