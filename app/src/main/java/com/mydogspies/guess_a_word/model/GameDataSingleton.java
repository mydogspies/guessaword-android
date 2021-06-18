package com.mydogspies.guess_a_word.model;

/**
 * The data object for each game round is this singleton and GameData should never
 * be called directly. Data should be added via GameDataInterfaceImpl.
 * @since 0.0.1
 * @see GameData
 * @see GameDataInterface
 * @see GameDataInterfaceImpl
 */
public class GameDataSingleton {

    private static GameDataSingleton instance;
    private GameData gameData;

    private GameDataSingleton() {}

    public static  GameDataSingleton getInstance() {
        if(instance == null) {
            synchronized (GameDataSingleton.class) {
                if(instance == null) {
                    instance = new GameDataSingleton();
                }
            }
        }
        return instance;
    }

    public GameData getGameData() {
        return gameData;
    }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }
}
