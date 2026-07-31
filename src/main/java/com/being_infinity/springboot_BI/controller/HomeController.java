package com.being_infinity.springboot_BI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/Practice/index.html";
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> e5768cf1430dd1684dabbc48a49255a86c77fbed
