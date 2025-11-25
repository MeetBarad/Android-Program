package com.example.task4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button bt1,bt2,bt3,bt4;
    int counter=0,max=99999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button5);

        int a=getResources().getColor(R.color.c1);
        int b=getResources().getColor(R.color.c2);
        int c=getResources().getColor(R.color.c3);
        int d=getResources().getColor(R.color.c4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter>=max)
                {
                    Toast.makeText(getApplicationContext(), "You Can Increase Up To 99999", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(counter>=49 &&counter<99)
                    {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(a);
                    } else if (counter>=99 && counter<149) {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(b);
                    }
                    else if (counter>=149 && counter<199)
                    {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(c);
                    } else if (counter>=199 && counter<249) {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(d);
                    }
                    counter++;
                    tv1.setText(String.valueOf(counter));
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter<=0)
                {
                    Toast.makeText(getApplicationContext(),"You Can Decrease Up To 0",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(counter>0 && counter<=51)
                    {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(getResources().getColor(R.color.white));
                    } else if (counter>51&& counter<=101) {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(a);
                    }
                    else if (counter>101&& counter<=151)
                    {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(b);
                    } else if (counter>151 && counter<=201) {
                        tv1.setText(String.valueOf(counter));
                        tv1.setBackgroundColor(c);
                    }
                    counter--;
                    tv1.setText(String.valueOf(counter));
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                tv1.setText(String.valueOf(counter));
                tv1.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), second.class);
                startActivity(i);
            }
        });
    }
}