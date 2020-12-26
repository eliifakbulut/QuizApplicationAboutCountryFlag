package com.example.a201635011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String userName = new String();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


        public void startButtonClick(View v) {
        EditText userNameEditText = findViewById(R.id.userNameEditText);
        if (userNameEditText.getText().length()>0){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(userName, userNameEditText.getText().toString());
            startActivity(intent);
            }else{
            Toast.makeText(this, "Username must be filled in", Toast.LENGTH_SHORT).show();
            }
        }
    }
