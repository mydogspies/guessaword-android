package com.mydogspies.guess_a_word;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mydogspies.guess_a_word.model.GameData;
import com.mydogspies.guess_a_word.model.GameDataSingleton;
import com.mydogspies.guess_a_word.model.MODE;
import com.mydogspies.guess_a_word.model.Word;
import com.mydogspies.guess_a_word.model.WordSingleton;

public class MainActivity extends AppCompatActivity {

    private EditText wordInputText;
    private Button wordEnterButton;
    private Button randomEnterButton;
    private Word word;
    private GameData gameData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        // set a new instance for the singleton that will contain our game data object
        gameData = new GameData();
        GameDataSingleton singleton = GameDataSingleton.getInstance();
        singleton.setGameData(gameData);

        initStartPage();
    }

    private void initStartPage() {

        wordInputText = findViewById(R.id.word_input);
        wordEnterButton = findViewById(R.id.enter_button);
        randomEnterButton = findViewById(R.id.random_game_button);

        wordEnterButton.setOnClickListener((view) ->  {
            if(wordInputText.getText().toString().trim().length() != 0) {

                // TODO after word enter
                // TODO add validations;
                // 1) non-empty
                // 2) only alphabetical chars
                // 3) only ascii
                // 4) min 3 chars, max 6

                String text = wordInputText.getText().toString();
                char[] charArray = text.toCharArray();

                word.setWord(text);
                word.setWordArray(charArray);
                gotoGamePage(MODE.PLAYER_VS_PLAYER, word);
            }

        });

        randomEnterButton.setOnClickListener((view) ->  {

            // TODO random game

            // TODO exchange test word for one from list
            String text = "hello";
            char[] charArray = text.toCharArray();

            word.setWord(text);
            word.setWordArray(charArray);

            gotoGamePage(MODE.PLAYER_VS_COMP, word);

        });

    }

    private void gotoGamePage(MODE mode, Word word) {
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        intent.putExtra("mode", mode);
        startActivity(intent);
    }
}