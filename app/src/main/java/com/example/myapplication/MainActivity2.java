package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ListView;


import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;


import com.example.myapplication.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main2);
            Button btnlogin = findViewById(R.id.btnlogin);
            EditText editText1 = findViewById(R.id.editTextText);
            EditText editText2 = findViewById(R.id.editTextText2);

            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity2.this ,MainListActivity.class);
                    startActivity(intent);
                    String username = editText1.getText().toString();
                    String password = editText2.getText().toString();
                    if(username.isEmpty()){
                        Toast.makeText(getApplicationContext(),"username is empty", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(getApplicationContext(), editText1.getText().toString(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
    }
}