package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class chatlistActivity extends AppCompatActivity {
ListView mList;
    ArrayList<item> arrayItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatlist);
        mList  = findViewById(R.id.list_view);
        arrayItem = new ArrayList<>();
        CustomAdapter mAdapter = new CustomAdapter(this, arrayItem);

        arrayItem.add(new item("avatar_1", "SeyedMahdi", "12:14", "سلام. بریم آبگرم فردوس؟"));
        arrayItem.add(new item("avatar_2", "Ahmad", "11:41", "فایلا رو دانلود کردی؟"));
        arrayItem.add(new item("avatar_3", "Morteza", "11:38", "شرمنده امروز نمیرسم بیام"));
        arrayItem.add(new item("avatar_4", "Farhad", "11:32", "اوکی. ممنون"));
        mList.setAdapter(mAdapter);
    }
}