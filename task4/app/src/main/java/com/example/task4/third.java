package com.example.task4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class third extends AppCompatActivity {

    TextView tv1;
    Button bt1,bt2,bt3,bt4,bt5;
    EditText etp1,etp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);

        tv1=findViewById(R.id.textView3);
        etp1=findViewById(R.id.editTextNumber);
        etp2=findViewById(R.id.editTextNumber2);
        bt1=findViewById(R.id.button7);
        bt2=findViewById(R.id.button8);
        bt3=findViewById(R.id.button9);
        bt4=findViewById(R.id.button10);
        bt5=findViewById(R.id.button11);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=etp1.getText().toString();
                String str2=etp2.getText().toString();
                if(str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter The Value!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a=Integer.parseInt(str1);
                    int b=Integer.parseInt(str2);
                    int c=a+b;
                    tv1.setText(String.valueOf(c));
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=etp1.getText().toString();
                String str2=etp2.getText().toString();
                if(str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter The Value!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a=Integer.parseInt(str1);
                    int b=Integer.parseInt(str2);
                    int c=a-b;
                    tv1.setText(String.valueOf(c));
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=etp1.getText().toString();
                String str2=etp2.getText().toString();
                if(str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter The Value!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a=Integer.parseInt(str1);
                    int b=Integer.parseInt(str2);
                    int c=a*b;
                    tv1.setText(String.valueOf(c));
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=etp1.getText().toString();
                String str2=etp2.getText().toString();
                if(str1.isEmpty() &&  str2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter The Value!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int a=Integer.parseInt(str1);
                    int b=Integer.parseInt(str2);
                    int c=a/b;
                    tv1.setText(String.valueOf(c));
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etp1.setText("");
                etp2.setText("");
                tv1.setText("0");

            }
        });
    }
}