package com.example.assignment2;

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

        EditText Text1= (EditText) findViewById(R.id.editTextTextPersonName);
        EditText Text2= (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText Text3= (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText Text4= (EditText) findViewById(R.id.editTextTextPersonName4);
        TextView TextView= (TextView) findViewById((R.id.textView));
        Button result=(Button) findViewById(R.id.button);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}