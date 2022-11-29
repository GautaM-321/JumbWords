package com.example.minorpjumbwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.regbutton);
        button2=(Button) findViewById(R.id.loginbutton);




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
          //  @Override
            public void onClick(View view) {
                openRegister();

            }

        });


    }

    private void openLogin() {
          //setProgressBarIndeterminate(true);
        Intent intent2=new Intent(this,login.class);

        startActivity(intent2);
        Toast.makeText(this, "you already have an account", Toast.LENGTH_SHORT).show();
    }

    private void openRegister() {
       // setProgressBarIndeterminate(true);
        Intent intent1 = new Intent(this, register.class);

        startActivity(intent1);
        Toast.makeText(this, "you are a new user", Toast.LENGTH_SHORT).show();
    }
}