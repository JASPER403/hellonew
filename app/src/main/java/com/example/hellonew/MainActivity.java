package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startActivity(new Intent(MainActivity.this,splashScreen.class));
//
//        // close splash activity
//        finish();
      }


    public void sendMessage(View view) {EditText message = (EditText)findViewById(R.id.message);
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    intent.putExtra("MESSAGE", message.getText().toString());
        startActivity(intent);
        message.setText(""); }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.item1:
                startActivity(new Intent(this,FirstActivity.class));
                return true;

            case R.id.item2:
                startActivity(new Intent(this,SecondActivity.class));
                return true;
            case R.id.item3:
                startActivity(new Intent(this,listView.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}

