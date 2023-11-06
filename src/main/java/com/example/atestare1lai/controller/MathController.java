package com.example.atestare1lai.controller;

import com.example.atestare1lai.model.Math;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping("/add")
    public String adunarea(Model model){
        Math math=new Math();
        int sum=0;
        model.addAttribute("math",math);
        model.addAttribute("sum",sum);
        return "suma";
    }

    @PostMapping("/add")
    public String adunarea2(@ModelAttribute(name = "math") Math math,Model model){
        try {
            int first=Integer.parseInt(math.getFirst());
            int calculatedsum= first + math.getSecond();
            model.addAttribute("sum", calculatedsum);
            return "suma";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/substract")
    public String substract(Model model){
        Math math=new Math();
        int sub=0;
        model.addAttribute("math",math);
        model.addAttribute("sub",sub);
        return "substract";
    }

    @PostMapping("/substract")
    public String substract2(@ModelAttribute(name = "math") Math math,Model model){
        try {
            int first=Integer.parseInt(math.getFirst());
            int calculatedsum= first - math.getSecond();
            model.addAttribute("sub", calculatedsum);
            return "substract";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/multiply")
    public String multiply(Model model){
        Math math=new Math();
        int mul=0;
        model.addAttribute("math",math);
        model.addAttribute("mul",mul);
        return "multiply";
    }

    @PostMapping("/multiply")
    public String multiply2(@ModelAttribute(name = "math") Math math,Model model){
        try {
            int first=Integer.parseInt(math.getFirst());
            int calculatedmul= first * math.getSecond();
            model.addAttribute("mul", calculatedmul);
            return "multiply";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/division")
    public String division(Model model){
        Math math=new Math();
        int div=0;
        model.addAttribute("math",math);
        model.addAttribute("divs",div);
        return "division";
    }

    @PostMapping("/division")
    public String division2(@ModelAttribute(name = "math") Math math,Model model){
        try {
            int first=Integer.parseInt(math.getFirst());
            int calculateddiv= first / math.getSecond();
            model.addAttribute("divs", calculateddiv);
            return "division";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

}

