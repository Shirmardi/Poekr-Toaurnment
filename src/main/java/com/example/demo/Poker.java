package com.example.demo;

public class Poker {

    private String numberOfPlayers;
    private String startingStack;
    private String smallestChipDenomination;


    public String getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public String getStartingStack() {
        return startingStack;
    }

    public String getSmallestChipDenomination() {
        return smallestChipDenomination;
    }

    public void setNumberOfPlayers(String numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setStartingStack(String startingStack) {
        this.startingStack = startingStack;
    }

    public void setSmallestChipDenomination(String smallestChipDenomination) {
        this.smallestChipDenomination = smallestChipDenomination;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "numberOfPlayers='" + numberOfPlayers + '\'' +
                ", startingStack='" + startingStack + '\'' +
                ", smallestChipDenomination='" + smallestChipDenomination + '\'' +
                '}';
    }
}
