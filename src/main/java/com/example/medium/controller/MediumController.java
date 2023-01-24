package com.example.medium.controller;

import com.example.medium.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MediumController {


    @RequestMapping("")
    public  String homePage(){
        return "page1";
    }
    @RequestMapping("/result")
    public  String getResults(UserDTO userDTO, Model model){
        model.addAttribute("user", userDTO);
        return "page2";
    }


}
