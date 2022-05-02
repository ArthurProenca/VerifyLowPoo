package dev.friday.lowpoo.service;

import dev.friday.lowpoo.entity.dto.Itens;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LowPooService {
    public ResponseEntity<Map<String, String>> checkLowPoo(String[] itens){
        final Map<String, String> map = new HashMap<>();
        Itens lowPooCatalog = new Itens();

        for(String catalogReceived : itens){
            if(lowPooCatalog.getSiliconesInsoluveis().contains(catalogReceived)){
                map.put("Silicones insolúveis", "consta");
            }
            if(lowPooCatalog.getSiliconesSoluveis().contains(catalogReceived)){
                map.put("Silicones solúveis", "consta");
            }
            if(lowPooCatalog.getSulfatosFortes().contains(catalogReceived)){
                map.put("Sulfatos fortes", "consta");
            }
            if(lowPooCatalog.getSulfatosFracos().contains(catalogReceived)){
                map.put("Sulfatos fracos", "consta");
            }
            if(lowPooCatalog.agentesLimpeza().contains(catalogReceived)){
                map.put("Agentes de limpeza", "consta");
            }
            if(lowPooCatalog.oleoMineral().contains(catalogReceived)){
                map.put("Óleo mineral", "consta");
            }
        }
        return ResponseEntity.status(200).body(map);
    }
}
