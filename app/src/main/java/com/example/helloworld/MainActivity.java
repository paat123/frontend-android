package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    Button login=(Button)findViewById(R.id.login);
    EditText username=(EditText) findViewById(R.id.username);
    EditText password=(EditText) findViewById(R.id.password);

//    login.setOnClickListener(new View.OnClickListener() {
//        {
//            // TODO Auto-generated method stub
//            Intent i = new Intent(MainActivity.this, SignupActivity.class);
//            startActivity(i);
//        }
//    });

    public void onBtnClick(View view){
        Intent i = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}