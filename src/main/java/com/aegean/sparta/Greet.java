package com.aegean.sparta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greet")
public class Greet {
    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){
        return "Yassas";
    }

    @RequestMapping("/luck")
    @ResponseBody
    public String luck(){
        Luck a = new Luck();
        return a.get_luck_string();
    }
}


