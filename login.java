package com.example.minorpjumbwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button3=(Button)findViewById(R.id.submitloginbutton);
        //button4=(Button)findViewById(R.id.submitregbutton) ;

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjumbWords();
            }
        });
    }
    private void openjumbWords()
    {
        Intent intent3=new Intent(this,jumbwords.class);
        startActivity(intent3);
    }
}