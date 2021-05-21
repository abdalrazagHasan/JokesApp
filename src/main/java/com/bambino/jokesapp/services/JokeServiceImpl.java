package com.bambino.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JokeServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl(ChuckNorrisQuotes quotes){
        this.quotes = quotes;
    }

    @Override
    public String getJoke(){
        return quotes.getRandomQuote();
    }

}
