package com.cinema.globant.microservicesCinema.dto.movies;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Movies {

    public int page;
    public ArrayList<Result> results;

}

