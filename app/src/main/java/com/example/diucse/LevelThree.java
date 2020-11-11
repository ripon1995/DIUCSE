package com.example.diucse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diucse.Fragment.TermEightFragment;
import com.example.diucse.Fragment.TermNineFragment;
import com.example.diucse.Fragment.TermOneFragment;
import com.example.diucse.Fragment.TermSevenFragment;
import com.example.diucse.Fragment.TermThreeFragment;
import com.example.diucse.Fragment.TermTwoFragment;

public class LevelThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three);

        Button term7=findViewById(R.id.term7);
        term7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment termSevenFragment=new TermSevenFragment();
                replaceFragment(termSevenFragment);

            }
        });

        Button term8=findViewById(R.id.term8);
        term8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termEightFragment=new TermEightFragment();
                replaceFragment(termEightFragment);
            }
        });

        Button term9=findViewById(R.id.term9);
        term9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termNineFragment=new TermNineFragment();
                replaceFragment(termNineFragment);
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
