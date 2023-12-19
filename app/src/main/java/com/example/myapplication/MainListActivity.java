package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.view.View;

import com.example.myapplication.databinding.ActivityMainListBinding;

public class MainListActivity extends AppCompatActivity {

    String[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        ListView clistview = (ListView) findViewById(R.id.listviewtest);
       colors = new String[] {"Red","Blue","Green","White"};
       ArrayAdapter<String> madapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.text_view, colors);
       clistview.setAdapter(madapter);

    }

}