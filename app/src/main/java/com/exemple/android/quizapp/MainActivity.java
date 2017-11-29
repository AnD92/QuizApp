package com.exemple.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startGame(View v){
        EditText text = (EditText)findViewById(R.id.phone);
        String name = text.getText().toString();
        //creo altra activity
        Intent intent=new Intent(getApplication(),game.class);
        //passo all' altra activity la stringa name
        intent.putExtra("stringaDaPassare",name);
        //lancio l' altra activity
        startActivity(intent);
    }
}
