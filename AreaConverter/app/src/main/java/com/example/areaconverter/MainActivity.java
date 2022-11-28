package com.example.areaconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=findViewById(R.id.editTextTextPersonName4);
        EditText editText2=findViewById(R.id.editTextTextPersonName5);
        TextView textView2=findViewById(R.id.textView6);
        Button btn=findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float l=0;

                l=Float.parseFloat(editText1.getText().toString());
                float w=0;

                w=Float.parseFloat(editText2.getText().toString());
                double a=l*w;
                textView2.setText(String.valueOf(a));
            }
        });
    }
}