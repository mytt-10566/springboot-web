package com.momo.springbootweb.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @author MQG
 */
@Controller
public class JspController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("names", Arrays.asList("小明", "小茗"));
        return "index";
    }
}
