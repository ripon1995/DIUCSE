package com.example.diucse;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diucse.Fragment.TermElevenFragment;
import com.example.diucse.Fragment.TermOneFragment;
import com.example.diucse.Fragment.TermTenFragment;
import com.example.diucse.Fragment.TermThreeFragment;
import com.example.diucse.Fragment.TermTwelveFragment;
import com.example.diucse.Fragment.TermTwoFragment;

public class LevelFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four);

        Button term10=findViewById(R.id.term10);
        term10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment termTenFragment=new TermTenFragment();
                replaceFragment(termTenFragment);

            }
        });

        Button term11=findViewById(R.id.term11);
        term11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termElevenFragment=new TermElevenFragment();
                replaceFragment(termElevenFragment);
            }
        });

        Button term12=findViewById(R.id.term12);
        term12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment termTwelveFragment=new TermTwelveFragment();
                replaceFragment(termTwelveFragment);
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
