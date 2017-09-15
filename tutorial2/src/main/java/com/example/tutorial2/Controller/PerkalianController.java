package com.example.tutorial2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class PerkalianController {

        @RequestMapping("/hello")
        public String hello(){
            return "hello";
        }

//        @RequestMapping("/greeting")
//        public String greeting(@RequestParam(value="name", required = false, defaultValue = "Guest") String name, Model model){
//            model.addAttribute("name", name);
//            return "greeting";
//        }

        @RequestMapping(value = {"/greeting/{name}"})
    public String greetinPath (@PathVariable Optional<String> name, Model model){
           if(name.isPresent()){
               model.addAttribute("name", name.get());
           }
           else {
               model.addAttribute("name", "wadow ada guest");
           }
            return "greeting";
        }
}
