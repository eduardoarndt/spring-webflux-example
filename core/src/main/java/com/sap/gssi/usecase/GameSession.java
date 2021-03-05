package com.sap.gssi.usecase;

import com.sap.gssi.domain.Player;

import java.util.List;

public class GameSession {
    String gameName;
    Boolean started;
    Boolean finished;
    List<Turn> turn;

    public GameSession(String gameName, Boolean started, Boolean finished, List<Turn> turn) {
        this.gameName = gameName;
        this.started = started;
        this.finished = finished;
        this.turn = turn;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getEnded() {
        return finished;
    }

    public void setEnded(Boolean ended) {
        finished = ended;
    }

    public List<Turn> getTurns() {
        return turn;
    }

    public void setTurns(List<Turn> turn) {
        this.turn = turn;
    }

    void addPlayers(List<Player> playerList) {

    }

    void orderPlayers(List<Player> playerList) {

    }

    void keepRecord(List<Player> playerList) {

    }

    @Override
    public String toString() {
        return "GameSession{" +
                "gameName='" + gameName + '\'' +
                ", isStarted=" + started +
                ", isEnded=" + finished +
                ", turn=" + turn +
                '}';
    }
}
