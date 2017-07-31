package pl.springmvc.pu.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 11.07.2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("greeting", "Welcome in our webstore");
        model.addAttribute("tagline", "One and only, unique online shop");

        return "welcome";
    }

}
