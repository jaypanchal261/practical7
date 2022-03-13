package com.example.practical7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a1,a2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a1= findViewById(R.id.user);
        a2= findViewById(R.id.ps);
        b1= findViewById(R.id.login);

        b1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String u= "abc123";
                String p= "xcvb456";

                if(TextUtils.isEmpty(a1.getText().toString()) && TextUtils.isEmpty(a2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Empty Input", Toast.LENGTH_SHORT).show();
                }
                else if(a1.getText().toString().equals(u) && a2.getText().toString().equals(p))
                {
                    Toast.makeText(getApplicationContext(), "Log In Successfully", Toast.LENGTH_SHORT).show();
                    String url = "http://www.google.com";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);

                }
                else{

                    Toast.makeText(getApplicationContext(), "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}


