package com.bambino.jokesapp.controllers;

import com.bambino.jokesapp.services.JokeServiceImpl;
import com.bambino.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jokes")
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService){
        this.jokesService = jokesService;
    }

    @GetMapping("/random")
    public String getJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "jokes";
    }

}
