package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Hangman game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if ( game == null )
            game = new Hangman( Hangman.DEFAULT_GUESSES);
        setContentView( R.layout.activity_main );
        TextView status = ( TextView ) findViewById( R.id.status );
        status.setText("" + game.getGuessesLeft( ));
    }
}