package com.hk.application.classification.common.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model

//TOPページ
@Controller
class MainController {
    @GetMapping("/")
    fun topPage(model : Model) : String {
        model.addAttribute("test","Hello world!!")
        return "index";
    }
}