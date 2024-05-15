package org.valorantunveil.servico;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.valorantunveil.dto.AgentesDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiServico {

    AgentesDto agentesDto = new AgentesDto();
    public AgentesDto getUuid(String uuid) throws IOException, InterruptedException {

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://valorant-api.com/v1/agents/"+ uuid)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            agentesDto = mapper.readValue(response.body(), AgentesDto.class);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return agentesDto;
    }
}
