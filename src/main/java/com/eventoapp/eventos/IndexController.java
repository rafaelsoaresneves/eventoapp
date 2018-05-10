package com.eventoapp.eventos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafael on 5/5/18.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
