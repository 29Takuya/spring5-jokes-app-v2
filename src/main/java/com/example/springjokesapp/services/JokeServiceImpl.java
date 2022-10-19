package com.example.springjokesapp.services;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private static final ChuckNorrisQuotes jokeGenerator = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return jokeGenerator.getRandomQuote();
    }
}
