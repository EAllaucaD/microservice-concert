package com.micro.concert.client;


import com.micro.concert.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "client", url = "localhost:8081/api/client")
public interface ClientConcert {


    @GetMapping("/search-my-concert/{idConcert}")
    List<ClientDTO> findAllClientByConcert(@PathVariable Long idConcert);
}
