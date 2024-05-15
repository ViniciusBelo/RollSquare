package org.valorantunveil;

import org.valorantunveil.dto.AgentesDto;
import org.valorantunveil.servico.ApiServico;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();
        List<String> uuid = getUuid();
        try{
            for(String uuid : u){
                AgentesDto agentesDto = apiServico.getUuid(uuid);
                System.out.println(agentesDto.getDisplayName());
                System.out.println(agentesDto.getDisplayIconSmall());
                System.out.println(agentesDto.getDescription());
                System.out.println(agentesDto.getRoleDisplayName());
                System.out.println(agentesDto.getRoleDisplayIcon());
                System.out.println(agentesDto.getRoleDescription());
                System.out.println(agentesDto.getAbility1Name());
                System.out.println(agentesDto.getAbility1Icon());
                System.out.println(agentesDto.getAbility2Name());
                System.out.println(agentesDto.getAbility2Icon());
                System.out.println(agentesDto.getAbility2Description());
                System.out.println(agentesDto.getGrenadeName());
                System.out.println(agentesDto.getGrenadeIcon());
                System.out.println(agentesDto.getGrenadeDescription());
                System.out.println(agentesDto.getUltimateName());
                System.out.println(agentesDto.getUltimateIcon());
                System.out.println(agentesDto.getUltimateDescription());
            }
        }catch(IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}