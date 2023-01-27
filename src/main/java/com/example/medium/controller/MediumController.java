package com.example.medium.controller;

import com.example.medium.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import java.util.List;

@Controller
public class MediumController {


    @RequestMapping("")
    public  String homePage(){
        return "page1";
    }
    @RequestMapping("/result")
    public  String getResults(@Valid  UserDTO userDTO, BindingResult bindingResult ,  Model model){

        System.out.println(userDTO);

        if (bindingResult.hasErrors()){
            System.out.println("error");
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError o : allErrors){
                System.out.println("error -->  " + o.getDefaultMessage());
            }

        }

        model.addAttribute("user", userDTO);
        return "page2";
    }


}
