package com.mydogspies.guess_a_word.model;


/**
 * This is the GameData pojo that contains all necessary data for each game round. Note that it is
 * created as a singleton and uses an interface for access.
 * @since 0.0.1
 * @see GameDataSingleton
 * @see GameDataInterface
 * @see GameDataInterfaceImpl
 */
public class GameData {

    private String word;
    private char[] wordArray;

    private Boolean playerMode;
    private int rounds;

    private int[][] resultArray;
    private int points;

    public String getWord() { return word; }

    public void setWord(String word) {
        this.word = word;
    }

    public char[] getWordArray() {
        return wordArray;
    }

    public void setWordArray(char[] wordArray) {
        this.wordArray = wordArray;
    }

    public Boolean getPlayerMode() {
        return playerMode;
    }

    public void setPlayerMode(Boolean playerMode) {
        this.playerMode = playerMode;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int[][] getResultArray() {
        return resultArray;
    }

    public void setResultArray(int[][] resultArray) {
        this.resultArray = resultArray;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
