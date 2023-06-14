package com.apphotel.hotelalura.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apphotel.hotelalura.web.models.Huesped;
import com.apphotel.hotelalura.web.services.HuespedServiceImpl;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HuespedServiceImpl huespedServiceImpl;

    @GetMapping("/home")
    public String mostrarHome(Model model) {
        Integer id = 1;
        Huesped huesped = huespedServiceImpl.obtenerHuesped(id);
        model.addAttribute("huesped", huesped);
        return "home.jsp";
    }
}
