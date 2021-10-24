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
                int a=Integer.parseInt(Text1.getText().toString());
                int b=Integer.parseInt(Text2.getText().toString());
                int c=Integer.parseInt(Text3.getText().toString());
                int d=Integer.parseInt(Text4.getText().toString());

                int z=a+d;

                if(z<73500 && b==0 && c== 0)
                {
                    TextView.setText("0");
                }

                else if(z==0 && b<7.5 && c== 0)
                {
                    TextView.setText("0");
                }

                else if(z==0 && b==0 && c<52.5)
                {
                    TextView.setText("0");
                }
                else
                    {
                        int g=b*112000;
                        int s=c*1400;
                        int zakat=a+g+s+d;
                        Double per= zakat*0.025;

                        TextView.setText(Double.toString(per));
                    }

            }
        });
    }
}