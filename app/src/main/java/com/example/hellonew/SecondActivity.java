package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {
Button btn;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView =findViewById(R.id.text);
        btn= findViewById(R.id.cbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pro="";
                try {
                    InputStream inputStream= getAssets().open("c-programe.c");
                    int c=inputStream.available();
                    byte[] space =new byte[c];
                    inputStream.read(space);
                    inputStream.close();
                    pro=new String(space);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText((CharSequence)pro);
            }
        });
    }
}
