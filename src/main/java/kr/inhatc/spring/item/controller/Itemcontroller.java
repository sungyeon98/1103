package kr.inhatc.spring.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Itemcontroller {

    @GetMapping("/admin/item/new")
    public String itemForm() {
        
        
        
        return "/item/itemForm";
    }
}
