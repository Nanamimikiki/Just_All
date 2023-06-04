package com.MusicBlog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorksPageController {
    @GetMapping("/works")
    public String works(Model model) {
        model.addAttribute("works", "Works");
        return "works";
    }

}
