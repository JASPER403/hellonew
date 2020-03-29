package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class vibrator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator);


    }


    //here
    public void alarmmethod(View view){
        EditText editText = (EditText) findViewById(R.id.alarmtxt);
        //changing the entered  text to a string then to an integer
        int z =Integer.parseInt(editText.getText().toString());

        //Create the intent and call your receiver explicit intent
        Intent intent= new Intent(getApplicationContext(),vibrator.class);
        startActivity(intent);

        //creating the pending intent
        PendingIntent pendingIntent;
        pendingIntent=PendingIntent.getBroadcast(this.getApplicationContext(),0,intent,0);

        //calling the alarm manager class to use the alarm also accessing the system service method to access services provided by
        // the android system
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);

        //setting the alarm time
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + (z* 1000),pendingIntent);

        //make a toast using a class Toast
        Toast.makeText(this," Your Alarm is set in: "+  z +"seconds",Toast.LENGTH_LONG).show();

    }

    //here
}
