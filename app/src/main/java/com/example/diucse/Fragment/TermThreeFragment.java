package com.example.diucse.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.diucse.R;

public class TermThreeFragment extends Fragment {

    Button btnDiscrete,btnElc,btnELab,btnDs,btnDsLab,btnOdePde;
    String url;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View retView=inflater.inflate(R.layout.term_three_fragment,container,false);
        btnDiscrete=retView.findViewById(R.id.books_discrete);
        btnDiscrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="https://firebasestorage.googleapis.com/v0/b/diucse-a4fb0.appspot.com/o/Rosen_Discrete_Mathematics_and_Its_Applications_7th_Edition.pdf?alt=media&token=4a7ed11a-50b4-4869-9846-34d09decd57b";
                downloadBooks(url);
            }
        });

        return retView;
    }

    public void downloadBooks(String url)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}
