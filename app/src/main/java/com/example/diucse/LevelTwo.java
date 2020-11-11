package com.example.diucse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diucse.Fragment.TermFiveFragment;
import com.example.diucse.Fragment.TermFourFragment;
import com.example.diucse.Fragment.TermOneFragment;
import com.example.diucse.Fragment.TermSixFragment;
import com.example.diucse.Fragment.TermThreeFragment;
import com.example.diucse.Fragment.TermTwoFragment;

public class LevelTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lelel_two);

        Button term4=findViewById(R.id.term4);
        term4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment termFourFragment=new TermFourFragment();
                replaceFragment(termFourFragment);

            }
        });

        Button term5=findViewById(R.id.term5);
        term5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termFiveFragment=new TermFiveFragment();
                replaceFragment(termFiveFragment);
            }
        });

        Button term6=findViewById(R.id.term6);
        term6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termSixFragment=new TermSixFragment();
                replaceFragment(termSixFragment);
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
