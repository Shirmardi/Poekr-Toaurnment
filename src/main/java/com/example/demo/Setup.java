package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Setup {

    @JsonProperty("player_count")
    private Double numberOfPlayers = 6.0;

    @JsonProperty ("initial_chips")
    private Double startingStack = 50000.0;

    @JsonProperty ("smallest_chip")
    private Double smallestChipDenomination = 100.0;

    @JsonProperty ("small_blind")
    private Double smallBlind = smallestChipDenomination;

    @JsonProperty ("big_blind")
    private Double bigBlind = smallBlind * 2;

    @JsonProperty ("levels")
    private Double numberOfBlindLevels = Math.round(startingStack / 10000.0) + 16.0;

    @JsonProperty ("game_duration")
    private Double intendedGameDuration = 60.0;

    @JsonProperty ("level_length")
    private Double blindLength = (Math.ceil(intendedGameDuration / numberOfBlindLevels));

    @JsonProperty ("final_big_blind")
    private Double finalBigBlind  = Math.round((((numberOfPlayers * startingStack) / 100) * 5) / (smallestChipDenomination * 2)) * (smallestChipDenomination * 2);

    @JsonProperty ("final_small_blind")
    private Double finalSmallBlind = Math.round((finalBigBlind / 2) / smallestChipDenomination) * smallestChipDenomination;

    @JsonProperty ("blind_increment")
    private Double blindIncrements = Math.round((finalSmallBlind / numberOfBlindLevels) / smallestChipDenomination) * smallestChipDenomination;

    @JsonProperty ("rebuys")
    private Double numberOfRebuys = 0.0;

    @JsonProperty ("level")
    private Integer level = 1;

    public void nextLevel() {
        this.smallBlind = smallBlind + blindIncrements;
        this.bigBlind = smallBlind * 2;
        this.level++;
    }








    public Double getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(Double numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public Double getStartingStack() {
        return startingStack;
    }

    public void setStartingStack(Double startingStack) {
        this.startingStack = startingStack;
    }

    public Double getSmallestChipDenomination() {
        return smallestChipDenomination;
    }

    public void setSmallestChipDenomination(Double smallestChipDenomination) {
        this.smallestChipDenomination = smallestChipDenomination;
    }

    public Double getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(Double smallBlind) {
        this.smallBlind = smallBlind;
    }

    public Double getBigBlind() {
        return bigBlind;
    }

    public void setBigBlind(Double bigBlind) {
        this.bigBlind = bigBlind;
    }

    public Double getNumberOfBlindLevels() {
        return numberOfBlindLevels;
    }

    public void setNumberOfBlindLevels(Double numberOfBlindLevels) {
        this.numberOfBlindLevels = numberOfBlindLevels;
    }

    public Double getIntendedGameDuration() {
        return intendedGameDuration;
    }

    public void setIntendedGameDuration(Double intendedGameDuration) {
        this.intendedGameDuration = intendedGameDuration;
    }

    public Double getBlindLength() {
        return blindLength;
    }

    public void setBlindLength(Double blindLength) {
        this.blindLength = blindLength;
    }

    public Double getFinalBigBlind() {
        return finalBigBlind;
    }

    public void setFinalBigBlind(Double finalBigBlind) {
        this.finalBigBlind = finalBigBlind;
    }

    public Double getFinalSmallBlind() {
        return finalSmallBlind;
    }

    public void setFinalSmallBlind(Double finalSmallBlind) {
        this.finalSmallBlind = finalSmallBlind;
    }

    public Double getBlindIncrements() {
        return blindIncrements;
    }

    public void setBlindIncrements(Double blindIncrements) {
        this.blindIncrements = blindIncrements;
    }

    public Double getNumberOfRebuys() {
        return numberOfRebuys;
    }

    public void setNumberOfRebuys(Double numberOfRebuys) {
        this.numberOfRebuys = numberOfRebuys;
    }

//    ROUND TO THE NEAREST SMALL CHIP DENOMINATION
//    Math.round(value / smallestChipDenomination) * smallestChipDenomination;


//    @JsonProperty private Set<Integer> chipsValues = new HashSet<>();
//    @JsonProperty private int[] chipDenominations = new int[] {100,500,1000,5000};
//    @JsonProperty private Integer smallestChipDenomination = chipsValues.stream()
//            .min(Comparator.comparingInt(Integer::intValue))
//            .get();

//    public SortedSet[] getChipDenominations() {
//        return chipDenominations;
//    }

}
