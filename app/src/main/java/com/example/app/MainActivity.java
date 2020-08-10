package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et= (EditText) findViewById(R.id.inputid);
        Button bt = findViewById(R.id.convertid);
        tv= (TextView) findViewById(R.id.resultid);
        bt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View v) {
                double val=39.37;
                double res=0.0;


                if(et.getText().toString().equals("")){
                    tv.setText(R.string.error_message);
                    tv.setTextColor(Color.RED);
                }
                else{
                    double enter = Double.parseDouble(et.getText().toString());
                    res = val*enter;
                    tv.setText(String.format("%.2f",res) +" inches");
                    tv.setTextColor(Color.DKGRAY);
                }


            }
        });
    }
}
