package com.elti.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by e.sh. on 26-Sep-18
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String findOwners() {
        return "notimplemented";
    }
}
