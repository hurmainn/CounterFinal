package com.example.counterupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.counterupdated.R;

public class MainActivity extends AppCompatActivity {

    int mCounter = 0;
    Button btn;
    TextView txv;
    Button resetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (android.widget.Button) findViewById (R.id.bt);
        txv = (TextView) findViewById (R.id.count);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    mCounter++;
                    txv.setText(Integer.toString(mCounter));
                }
            }
        });

        resetbtn=findViewById(R.id.resetbtn);

        resetbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mCounter=0;
                txv.setText(Integer.toString(mCounter));
            }
        });
    }

}