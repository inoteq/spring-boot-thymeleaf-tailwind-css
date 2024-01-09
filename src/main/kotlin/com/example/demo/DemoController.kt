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
    @GetMapping("/", "/modelEndpoint")
    fun myIndexEndpointWithModel(model: Model): String {
        model.addAttribute("myEndpoints", listOf("foo", "bar", "baz"))
        return "index"
    }

    // Using ModelAndView from org.springframework.web.servlet.ModelAndView
    @GetMapping("/modelAndViewEndpoint")
    fun myIndexEndpointWithModelAndView(): ModelAndView = ModelAndView("index")
        .addObject("myEndpoints", listOf("foo", "bar", "baz"))

    @GetMapping("/foo")
    fun fooEndpoint(): String = "foo"

    @GetMapping("/bar")
    fun barEndpoint(): String = "bar"

    @GetMapping("/baz")
    fun bazEndpoint(): String = "baz"
}
