package com.tcl.ml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QueryController {

    @RequestMapping(value="a", method=RequestMethod.GET)
    public String get(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello" + name;
    }
}
