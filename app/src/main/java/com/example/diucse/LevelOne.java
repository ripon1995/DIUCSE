package com.example.diucse;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diucse.Fragment.TermOneFragment;
import com.example.diucse.Fragment.TermThreeFragment;
import com.example.diucse.Fragment.TermTwoFragment;

public class LevelOne extends AppCompatActivity {

    String url="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        Button term1=findViewById(R.id.term1);
        term1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment termOneFragment=new TermOneFragment();
                replaceFragment(termOneFragment);
            }
        });

        Button term2=findViewById(R.id.term2);
        term2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termTwoFragment=new TermTwoFragment();
                replaceFragment(termTwoFragment);
            }
        });

        Button term3=findViewById(R.id.term3);
        term3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termThreeFragment=new TermThreeFragment();
                replaceFragment(termThreeFragment);

            }
        });

    }

    public void replaceFragment(Fragment destFragment)
    {
        // First get FragmentManager object.
        FragmentManager fragmentManager = this.getSupportFragmentManager();

        // Begin Fragment transaction.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the layout holder with the required Fragment object.
        fragmentTransaction.replace(R.id.dynamic_fragment_frame_layout, destFragment);

        // Commit the Fragment replace action.
        fragmentTransaction.commit();
    }

}
