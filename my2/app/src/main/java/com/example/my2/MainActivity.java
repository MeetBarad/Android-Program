package com.example.my2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;
    TextView tv1,tv2;

    EditText et1;
    int add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.button2);
        bt2=findViewById(R.id.button3);
        bt3=findViewById(R.id.button);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView3);
        et1=findViewById(R.id.editText);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et1.getText().toString());
                add=add+a;
                et1.setText("");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(et1.getText().toString());
                add=add+a;
                tv2.setText(String.valueOf(add));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add=0;
                tv2.setText("");
                et1.setText("");
            }
        });

    }
}