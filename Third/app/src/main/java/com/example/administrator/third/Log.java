package com.example.administrator.third;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Log extends AppCompatActivity {
    private Button toRegiste;
    private Button login;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        back=(Button) findViewById(R.id.back_button);
        toRegiste=(Button) findViewById(R.id.Registe_button);
       /* login=(Button) findViewById(R.id.login_button);*/


        toRegiste.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent i=new Intent(Log.this,Registe.class);
               startActivity(i);
            }
        });

        /*login.setOnClickListener(new View.OnClickListener(){
             Bundle information= getIntent().getExtras();
               String name = information.getString("name");
               String password = information.getString("second");
            public void onClick(View v){
                Intent i=new Intent(Log.this,Registe.class);
                startActivity(i);
            }
        });*/

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}



