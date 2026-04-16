package com.example.battleservice.model;

public class BattleResponse {
    private String winner;
    private String message;

    public BattleResponse() {
    }

    public BattleResponse(String winner, String message) {
        this.winner = winner;
        this.message = message;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}