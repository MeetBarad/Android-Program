package com.example.myapp1;

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

public class SecondScreen extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    Button bt1,bt2;
    EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second_screen);

        tv1=findViewById(R.id.textView5);
        tv2=findViewById(R.id.textView3);
        tv3=findViewById(R.id.textView4);
        tv4=findViewById(R.id.textView6);
        bt1=findViewById(R.id.button2);
        bt2=findViewById(R.id.button3);
        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextText2);
        et3=findViewById(R.id.editTextPhone);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                String str3=et3.getText().toString();
                String str="Name: "+str1+"\nCity: "+str2+"\nPhone: "+str3;
                tv4.setText(str);
            }
        });
        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                String str3=et3.getText().toString();
                String str="Name: "+str1+"\nCity: "+str2+"\nPhone: "+str3;
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
                return false;
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                String str3=et3.getText().toString();
                String[] str={str1,str2,str3};

                Intent i=new Intent(getApplicationContext(), ThirdScreen.class);
                i.putExtra("data",str);
                startActivity(i);
            }
        });
    }
}