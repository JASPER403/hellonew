package com.example.hellonew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class listView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        this.arrayAdapterListView();
    }
    private void arrayAdapterListView(){
        setTitle("dev2qa.com - ArrayAdapter List View Example");

        List<String> dataList = new ArrayList<String>();
        dataList.add("VIDEOS");
        dataList.add("GAMES");
        dataList.add("DOCUMENTS");
        dataList.add("AUDIO");
        dataList.add("APP-SETUPS");

        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, dataList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(listView.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
