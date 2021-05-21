package com.bambino.jokesapp.config;

import com.bambino.jokesapp.services.JokeServiceAnother;
import com.bambino.jokesapp.services.JokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfig {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

    @Bean
    public JokeServiceImpl jokeService(){
        return new JokeServiceImpl(chuckNorrisQuotes());
    }

    @Bean
    public JokeServiceAnother jokesService(){
        return new JokeServiceAnother(chuckNorrisQuotes());
    }


}
