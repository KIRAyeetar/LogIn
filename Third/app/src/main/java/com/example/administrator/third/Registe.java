package com.example.administrator.third;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Registe extends AppCompatActivity {
    private Button toLog;
    private EditText getPassword;
    private EditText getName;
    private String password;
    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registe);



        toLog=(Button) findViewById(R.id.toLog_button);
        toLog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Registe.this,R.string.afterRegiste_toals,Toast.LENGTH_SHORT).show();

               /* getPassword=(EditText) findViewById(R.id.password_edittext);
                getName=(EditText) findViewById(R.id.name_edittext);
                password = getPassword.getText().toString();
                name = getName.getText().toString();
                Bundle information = new Bundle();
                information.putString("name",name);
                information.putString("password",password);*/

                finish();
            }
        });
    }

}