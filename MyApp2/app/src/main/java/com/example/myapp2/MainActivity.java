package com.example.myapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button bt1,bt2,bt3,bt4,bt5;
    ImageView iv1;
    int b=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView);
        bt1=findViewById(R.id.button);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
        bt5=findViewById(R.id.button5);
        iv1=findViewById(R.id.imageView);
;
        String[] str1=getResources().getStringArray(R.array.bike);
        int a=str1.length;
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a-1>b){
                    b=b+1;
                    tv1.setText(str1[b]+"\n");
                }
                else {
                    Toast.makeText(getApplicationContext(),"No More Recordes",Toast.LENGTH_LONG).show();
                }

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b > 0) {
                    b = b - 1;
                    tv1.setText(str1[b]+"\n");
                } else {
                    Toast.makeText(getApplicationContext(), "No More Recordes", Toast.LENGTH_SHORT).show();
                }
            }
        });
        int ab1= R.drawable.im1;
        int ab2 = R.drawable.im2;
        int ab3 = R.drawable.im3;
        int ab4 = R.drawable.im4;
        int ab5 = R.drawable.im5;
        int[] img={ab1,ab2,ab3,ab4,ab5};

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img.length-1>b){
                    b=b+1;
                    iv1.setImageResource(img[b]);
                }
                else {
                    Toast.makeText(getApplicationContext(),"No More Imaiges",Toast.LENGTH_LONG).show();
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b > 0) {
                    b = b - 1;
                    iv1.setImageResource(img[b]);
                } else {
                    Toast.makeText(getApplicationContext(), "No previous image", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), SecondScreen.class);
                startActivity(i);
            }
        });

    }
}