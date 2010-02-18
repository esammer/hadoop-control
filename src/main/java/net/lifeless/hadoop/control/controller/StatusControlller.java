package net.lifeless.hadoop.control.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/status")
public class StatusControlller {

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("/status/index");
    }

}
