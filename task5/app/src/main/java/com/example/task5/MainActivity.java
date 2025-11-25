package com.example.task5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btc,bte,btd,add,sub,mul,div;
    String input="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView);

        Button[] btn = new Button[10];

        btn[0] = findViewById(R.id.button10);
        btn[1] = findViewById(R.id.button9);
        btn[2] = findViewById(R.id.button8);
        btn[3] = findViewById(R.id.button7);
        btn[4] = findViewById(R.id.button6);
        btn[5] = findViewById(R.id.button5);
        btn[6] = findViewById(R.id.button4);
        btn[7] = findViewById(R.id.button3);
        btn[8] = findViewById(R.id.button2);
        btn[9] = findViewById(R.id.button);

        Button add = findViewById(R.id.button14);
        Button sub = findViewById(R.id.button15);
        Button mul = findViewById(R.id.button16);
        Button div = findViewById(R.id.button17);
        Button bte = findViewById(R.id.button12);
        Button btc = findViewById(R.id.button11);

        for (Button b : btn) {
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input += ((Button) v).getText().toString();
                    tv1.setText(input);
                }
            });
        }
        View.OnClickListener opListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input += ((Button)v).getText().toString();
                tv1.setText(input);
            }
        };

        add.setOnClickListener(opListener);
        sub.setOnClickListener(opListener);
        mul.setOnClickListener(opListener);
        div.setOnClickListener(opListener);

        btc.setOnClickListener(v -> {
            input = "";
            tv1.setText("");
        });



    }
}