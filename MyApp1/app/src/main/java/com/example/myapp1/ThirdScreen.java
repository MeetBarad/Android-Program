package com.example.myapp1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdScreen extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third_screen);
        String str[]=getIntent().getStringArrayExtra("data");
        tv1=findViewById(R.id.textView7);
        tv1.setText("Name: "+str[0]+"\nCity: "+str[1]+"\nPhone: "+str[2]);
    }
}