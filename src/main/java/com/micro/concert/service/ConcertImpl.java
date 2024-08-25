package com.micro.concert.service;

import com.micro.concert.client.ClientConcert;
import com.micro.concert.dto.ClientDTO;
import com.micro.concert.entities.Concert;
import com.micro.concert.http.response.ClientByConcertResponse;
import com.micro.concert.repository.IConcertRepository;
import jakarta.ws.rs.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertImpl  implements IConcertService{

    @Autowired
    private IConcertRepository concertRepository;

    @Autowired
    private ClientConcert clientConcert;


    @Override
    public List<Concert> findAll() {
        return (List<Concert>) concertRepository.findAll();
    }

    @Override
    public Concert findById(Long id) {
        return concertRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Concert concert) {
        concertRepository.save(concert);

    }

    @Override
    public ClientByConcertResponse findClientsByIdConcert(Long idConcert) {

        //Consultar el concierto
        Concert concert = concertRepository.findById(idConcert).orElse(new Concert());

        //Obtener los clientes

        List<ClientDTO> clientDTOList = clientConcert.findAllClientByConcert(idConcert);
        return ClientByConcertResponse.builder()
                .concertName(concert.getName())
                .clientDTOList(clientDTOList)
                .build();
    }
}
