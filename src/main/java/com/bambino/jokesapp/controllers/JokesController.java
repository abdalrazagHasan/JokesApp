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

    private final JokesService jokeService;

    public JokesController(JokesService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping("/random")
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "jokes";
    }

}
