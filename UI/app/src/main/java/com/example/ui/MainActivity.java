package com.example.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText et1,et2;
    VideoView v1;
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
        v1=findViewById(R.id.videoView);
        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextTextPassword2);
        bt1=findViewById(R.id.button);
        String path="android.resource://" + getPackageName() + "/" + R.raw.login;
        v1.setVideoURI(Uri.parse(path));
        v1.start();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unm=et1.getText().toString().trim();
                String psw=et2.getText().toString().trim();
                if (unm.isEmpty() && psw.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Fill The Information!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    String nm="meet";
                    String ps="meet";
                    if (unm.equalsIgnoreCase(nm) && psw.equalsIgnoreCase(ps))
                    {
                        Toast.makeText(getApplicationContext(),"Login Sucessfully!",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Login Failed!",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}