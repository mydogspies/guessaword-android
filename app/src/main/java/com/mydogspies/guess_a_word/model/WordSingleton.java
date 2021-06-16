package com.mydogspies.guess_a_word.model;

/**
 * We set this class to be the single instance of a word throughout the entire app.
 * @since 0.0.1
 * @see Word
 */
public class WordSingleton {

    private static WordSingleton instance;
    private Word word;

    private WordSingleton() {}

    public static WordSingleton getInstance() {
        if (instance == null) {
            synchronized (WordSingleton.class) {
                if (instance == null) {
                    instance = new WordSingleton();
                }
            }
        }
        return instance;
    }

    public Word getWord() {return  word;}

    public void setWord(Word word) {this.word = word;}
}
