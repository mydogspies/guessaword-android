package com.mydogspies.guess_a_word;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mydogspies.guess_a_word.model.Word;
import com.mydogspies.guess_a_word.model.WordSingleton;
import com.mydogspies.guess_a_word.model.MODE;

public class GameActivity extends AppCompatActivity {

    private Word word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }

    private void init() {
        word = WordSingleton.getInstance().getWord();
        System.out.println(word.getWord());
        System.out.println(word.getWordArray());

        Intent intent = getIntent();

    }
}
