package com.mydogspies.guess_a_word.model;

public class GameDataInterfaceImpl implements GameDataInterface {

    private GameData gameData = GameDataSingleton.getInstance().getGameData();

    @Override
    public void addWord(String word) {
        gameData.setWord(word);
        char[] charArray = word.toCharArray();
        gameData.setWordArray(charArray);
    }

    @Override
    public void gameSettings(Boolean playerMode, int rounds) {
        gameData.setPlayerMode(playerMode);
        gameData.setRounds(rounds);
    }

    @Override
    public void addToResultArray(int[] newResult) {

    }

    @Override
    public void addToPoints(int points) {
        int currentPoints = gameData.getPoints();
        gameData.setPoints(currentPoints + points);
    }

    @Override
    public void resetGame() {
        gameData.setWord("");

    }
}
