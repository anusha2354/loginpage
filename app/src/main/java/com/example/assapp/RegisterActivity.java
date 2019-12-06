package com.example.assapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button button1,button2;
    String getNamedit,getRoledit,getAdedit,getColedit,getUseredit,getPassedit,getConedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.nameedit);
        e2=(EditText)findViewById((R.id.rolledit));
        e3=(EditText)findViewById(R.id.adedit);
        e4=(EditText)findViewById(R.id.calledit);
        e5=(EditText)findViewById(R.id.useredit);
        e6=(EditText)findViewById(R.id.passedit);
        e7=(EditText)findViewById(R.id.conformedit);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNamedit.equals("register")&&getRoledit.equals("12")) {
                    Toast.makeText(getApplicationContext(), "register sucess", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"go to login button",Toast.LENGTH_LONG).show();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getNamedit=e1.getText().toString();
                getRoledit=e2.getText().toString();
                getAdedit=e3.getText().toString();
                getColedit=e4.getText().toString();
                getUseredit=e5.getText().toString();
                getPassedit=e6.getText().toString();
                getConedit=e7.getText().toString();


                Toast.makeText(getApplicationContext(),getNamedit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getRoledit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAdedit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getColedit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getUseredit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassedit,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getConedit,Toast.LENGTH_LONG).show();

    }
});



    }
}
