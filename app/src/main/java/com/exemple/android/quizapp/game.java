package com.exemple.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Iterator;
import java.util.Vector;

public class game extends AppCompatActivity {
    int correct_answer = 0;
    String player_name;
    int player_answer1;
    int player_answer2;
    int player_answer3;
    int player_answer4;
    int player_answer5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        //reupero i dati dalla MainActivity
        Bundle dati = getIntent().getExtras();
        player_name = dati.getString("stringaDaPassare");

    }

    public void endGame(View v) {
        //all Radiobuttons
        RadioButton button_1a = (RadioButton) findViewById(R.id.answer_1a);
        RadioButton button_1b = (RadioButton) findViewById(R.id.answer_1b);
        RadioButton button_1c = (RadioButton) findViewById(R.id.answer_1c);
        RadioButton button_2a = (RadioButton) findViewById(R.id.answer_2a);
        RadioButton button_2b = (RadioButton) findViewById(R.id.answer_2b);
        RadioButton button_2c = (RadioButton) findViewById(R.id.answer_2c);
        RadioButton button_3a = (RadioButton) findViewById(R.id.answer_3a);
        RadioButton button_3b = (RadioButton) findViewById(R.id.answer_3b);
        RadioButton button_3c = (RadioButton) findViewById(R.id.answer_3c);
        RadioButton button_4a = (RadioButton) findViewById(R.id.answer_4a);
        RadioButton button_4b = (RadioButton) findViewById(R.id.answer_4b);
        RadioButton button_4c = (RadioButton) findViewById(R.id.answer_4c);
        RadioButton button_5a = (RadioButton) findViewById(R.id.answer_5a);
        RadioButton button_5b = (RadioButton) findViewById(R.id.answer_5b);
        RadioButton button_5c = (RadioButton) findViewById(R.id.answer_5c);
        //  soluzione
        int solution_1 = button_1b.getId();
        int solution_2 = button_2c.getId();
        int solution_3 = button_3a.getId();
        int solution_4 = button_4b.getId();
        int solution_5 = button_5c.getId();
        //risposte

        if (button_1a.isChecked())
            player_answer1 = button_1a.getId();
        if (button_1b.isChecked())
            player_answer1 = button_1b.getId();

        if (button_1c.isChecked())
            player_answer1 = button_1c.getId();
        if (button_2a.isChecked())
            player_answer2 = button_2a.getId();
        else if (button_2b.isChecked())
            player_answer2 = button_2b.getId();
        else if (button_2c.isChecked())
            player_answer2 = button_2c.getId();

        if (button_3a.isChecked())
            player_answer3 = button_3a.getId();
        else if (button_3b.isChecked())
            player_answer3 = button_3b.getId();
        else if (button_3c.isChecked())
            player_answer3 = button_3c.getId();

        if (button_4a.isChecked())
            player_answer4 = button_4a.getId();
        else if (button_4b.isChecked())
            player_answer4 = button_4b.getId();
        else if (button_4c.isChecked())
            player_answer4 = button_4c.getId();

        if (button_5a.isChecked())
            player_answer5 = button_5a.getId();
        else if (button_5b.isChecked())
            player_answer5 = button_5b.getId();
        else if (button_5c.isChecked())
            player_answer5 = button_5c.getId();

        //controllo risposte
        if (player_answer1 == solution_1) {
            correct_answer++;
        }
        if (player_answer2 == solution_2)
            correct_answer++;
        if (player_answer3 == solution_3)
            correct_answer++;
        if (player_answer4 == solution_4)
            correct_answer++;
        if (player_answer5 == solution_5)
            correct_answer++;

        toastMessage();
        correct_answer = 0;//reset punteggio

    }

    void toastMessage() {
        Context context = getApplicationContext();
        CharSequence text = "Player: " + player_name + "\n" + "Correct answer: " + correct_answer+"/5";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}



