package com.micro.concert.service;

import com.micro.concert.entities.Concert;
import com.micro.concert.http.response.ClientByConcertResponse;

import java.util.List;

public interface IConcertService {

    List<Concert> findAll();

    Concert findById(Long id);

    void save(Concert concert);

    ClientByConcertResponse findClientsByIdConcert(Long idConcert);
}
