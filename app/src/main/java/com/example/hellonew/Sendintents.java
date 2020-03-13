package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sendintents extends AppCompatActivity {
    Button btncall,btnemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendintents);
       btncall=findViewById(R.id.call);
       btnemail=findViewById(R.id.email);

                btncall.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v){
            Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0784068349")) ;
            startActivity(intent);
        }
        });
                btnemail.setOnClickListener(new View.OnClickListener(){
                 public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","jaspermars67@gmail.com,jaspermars67@gmail.com,jaspermars67@gmail.com",null)) ;
                   //subject
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Important Message");
                    //email body
                     intent.putExtra(Intent.EXTRA_TEXT,"Hi this is Jasper,mail back if you have recieved my text");
                     startActivity(intent);
                 }
                });


    }

}
