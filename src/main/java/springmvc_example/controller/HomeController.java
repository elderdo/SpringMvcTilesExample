package springmvc_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/template1")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home1");
        return model;
    }
    
    @RequestMapping(value = "/template2")
    public ModelAndView home2() {
        ModelAndView model = new ModelAndView("home2");
        return model;
    }

}
