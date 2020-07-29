package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] names = {"Raghav", "Mani", "Gowtham","Alpha","Beta","Gamma","Delta","Raghav", "Mani", "Gowtham","Alpha","Beta","Gamma","Delta","Raghav", "Mani", "Gowtham","Alpha","Beta","Gamma","Delta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewy);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);
    }
}