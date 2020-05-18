package org.wengll.tools.code.generator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${code.generator.controller-path:'/generator'}")
public class GeneratorController {

    @GetMapping("${code.generator.list-method-path:'/list'}")
    public String list(){
        return "/generator/list";
    }
}
