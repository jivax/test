package company.sibirsoft.test.controller;

import company.sibirsoft.test.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Map<String, Object> model){
        // model.put("some", "SSSSSSSSS");
        Message message=new Message();
        message.setWord("hello");
        message.setQuantity("World");
        model.put("message", message);
    return "main";
    }

}
