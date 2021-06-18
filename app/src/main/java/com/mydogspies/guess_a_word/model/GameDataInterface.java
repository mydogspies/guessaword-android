package com.mydogspies.guess_a_word.model;

/**
 * This interface defines the methods for manipulating the GameData object for each round.
 * Notice: The GameData object is used as a singleton and the correct way to reset it
 * for every round is using the corresponding method below.
 * @since 0.0.1
 * @see GameData
 * @see GameDataSingleton
 * @see GameDataInterfaceImpl
 */
public interface GameDataInterface {

    void addWord(String word);
    void gameSettings(Boolean playerMode, int rounds);

    void addToResultArray(int[] newResult);
    void addToPoints(int points);

    void resetGame();
}
