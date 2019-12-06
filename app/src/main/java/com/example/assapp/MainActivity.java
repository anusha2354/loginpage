package com.example.assapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   EditText ed1,ed2;
   Button button,button2;
   String getUname,getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.username);
        ed2=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.loginbutton);
        button2=(Button)findViewById(R.id.regbutton);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getUname=ed1.getText().toString();
                getPassword=ed2.getText().toString();


                Toast.makeText(getApplicationContext(),getUname,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                Log.d("username",getUname);
                Log.d("pass",getPassword);
                if(getUname.equals("admin")&&getPassword.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "login sucess", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"login fail",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
