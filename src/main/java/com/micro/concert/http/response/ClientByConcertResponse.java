package com.micro.concert.http.response;

import com.micro.concert.dto.ClientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientByConcertResponse {
    private String concertName;
    private List<ClientDTO> clientDTOList;

}
