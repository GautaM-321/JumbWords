package com.example.minorpjumbwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    //private Button button3;
    private Button button4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     //   button3=(Button)findViewById(R.id.submitloginbutton);
        button4=(Button)findViewById(R.id.submitregbutton) ;
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjumbWords();
            }
        });

    }
    private void openjumbWords()
    {
        Intent intent4=new Intent(this,jumbwords.class);
        startActivity(intent4);
    }
}