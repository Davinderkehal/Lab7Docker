package com.example.battleservice.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BattleController {

    @PostMapping("/battles")
    public Map<String, Object> fight(@RequestBody Map<String, Object> request) {
        Integer fighter1Id = (Integer) request.get("fighter1Id");
        Integer fighter2Id = (Integer) request.get("fighter2Id");
        String playerName = (String) request.get("playerName");

        Map<String, Object> response = new HashMap<>();

        if (fighter1Id == null || fighter2Id == null) {
            response.put("winner", "None");
            response.put("message", "Both fighters must be selected.");
            return response;
        }

        int winnerId = (fighter1Id <= fighter2Id) ? fighter1Id : fighter2Id;

        response.put("fighter1Id", fighter1Id);
        response.put("fighter2Id", fighter2Id);
        response.put("winner", "Fighter " + winnerId);
        response.put("message", "Battle completed successfully for player " + playerName + ".");

        return response;
    }
}