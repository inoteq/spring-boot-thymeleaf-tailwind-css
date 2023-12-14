package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping
class DemoController {
    // Using Model from org.springframework.ui.Model
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("endpoints", listOf("foo", "bar", "baz"))
        return "index"
    }

    // Using ModelAndView from org.springframework.web.servlet.ModelAndView
    @GetMapping("/index")
    fun index(): ModelAndView = ModelAndView("index")
        .addObject("endpoints", listOf("foo", "bar", "baz"))

    @GetMapping("/foo")
    fun foo(): String = "foo"

    @GetMapping("/bar")
    fun bar(): String = "bar"

    @GetMapping("/baz")
    fun baz(): String = "baz"
}
