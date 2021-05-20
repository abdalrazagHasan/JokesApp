package com.bambino.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokeServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl(){
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return quotes.getRandomQuote();
    }

}
