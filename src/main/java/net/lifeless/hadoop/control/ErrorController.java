package net.lifeless.hadoop.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ErrorController implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        ModelAndView mav;

        mav = new ModelAndView("/error");

        mav.addObject("originalRequest", request);
        mav.addObject("handler", handler);
        mav.addObject("exception", e);

        logger.error("User exception occurred:", e);

        return mav;
    }

}
