package com.example.perkalian.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerkalianController {

    @RequestMapping("/perkalian")
    public String index(@RequestParam(value="a", required=false, defaultValue = "0") String a, @RequestParam(value="b", required=false, defaultValue = "0") String b, Model model){

        model.addAttribute("a", a);
        model.addAttribute("b", b);

        int satu = Integer.parseInt(a);
        int dua = Integer.parseInt(b);

        int hasil = satu * dua;

        model.addAttribute("hasil", hasil);
        return "perkalian";
    }
}
