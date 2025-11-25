package com.example.task4;

import android.content.Intent;
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

import java.util.Random;

public class second extends AppCompatActivity {

    TextView tv1;
    Button bt1,bt2;
    EditText et1,et2;
    int small=0,large;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        tv1=findViewById(R.id.textView2);
        bt1=findViewById(R.id.button4);
        bt2=findViewById(R.id.button6);
        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextText2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String v1=et1.getText().toString();
                String v2=et2.getText().toString();

                if(v1.isEmpty() && v2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Plese Enter Both Values",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int r1;
                    Random r=new Random();
                    if(!v1.isEmpty() && v2.isEmpty())
                    {
                        int a=Integer.parseInt(v1);
                        large=a+100;
                        r1=r.nextInt(large-a+1)+a;
                        tv1.setText(String.valueOf(r1));
                    }
                    else if (!v2.isEmpty() && v1.isEmpty())
                    {
                        int b=Integer.parseInt(v2);
                        r1=r.nextInt(b+1);
                        tv1.setText(String.valueOf(r1));
                    }
                    else
                    {
                        int a=Integer.parseInt(v1);
                        int b=Integer.parseInt(v2);
                        small=Math.min(a,b);
                        large=Math.max(a,b);
                        r1=r.nextInt(b-a+1)+a;
                        tv1.setText(String.valueOf(r1));

                    }
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), third.class);
                startActivity(i);
            }
        });

    }
}