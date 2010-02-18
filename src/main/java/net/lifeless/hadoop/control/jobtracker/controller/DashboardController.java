package net.lifeless.hadoop.control.jobtracker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jobtracker/dashboard")
public class DashboardController {

    private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav;

        logger.info("Display dashboard");

        mav = new ModelAndView("/jobtracker/dashboard/index");

        return mav;
    }
}
