package com.example.diucse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void levelOne(View view) {
        Intent intent =new Intent(MainActivity.this,LevelOne.class);
        startActivity(intent);
    }

    public void levelTwo(View view) {
        Intent intent=new Intent(MainActivity.this,LevelTwo.class);
        startActivity(intent);
    }

    public void levelThree(View view) {
        Intent intent=new Intent(MainActivity.this,LevelThree.class);
        startActivity(intent);
    }

    public void levelFour(View view) {
        Intent intent=new Intent(MainActivity.this,LevelFour.class);
        startActivity(intent);
    }
}
