package com.example.agecalculate;

import android.health.connect.datatypes.units.Percentage;
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

import java.time.LocalDate;
import java.time.Period;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText et1,et2,et3;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bt1=findViewById(R.id.button);
        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextText2);
        et3=findViewById(R.id.editTextText3);
        tv1=findViewById(R.id.textView);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int date=Integer.parseInt(et1.getText().toString());
                int month=Integer.parseInt(et2.getText().toString());
                int year=Integer.parseInt(et3.getText().toString());
                LocalDate dt=LocalDate.now();
                LocalDate today=LocalDate.of(year,month,date);

                Period p=Period.between(dt,today);
                tv1.setText("Age:"+String.valueOf(p.getYears())+"\n"+"Month:"+String.valueOf(p.getMonths())+"\n"+"Day:"+String.valueOf(p.getDays()));
            }
        });



    }
}