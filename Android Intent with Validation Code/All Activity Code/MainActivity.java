package com.example.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtuser;
    EditText txtpass;

    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser=(EditText)findViewById(R.id.txtuser);
        txtpass=(EditText)findViewById(R.id.txtpass);

        btnlogin = findViewById(R.id.button);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
    }
public void Check(){
        if (txtuser.getText().toString().equals("ronron12") && txtpass.getText().toString().equals("1215") ){
            Intent start = new Intent(this, dashboard.class
            );
            startActivity(start);
        }

    else if (txtuser.getText().toString().equals("pammy01") && txtpass.getText().toString().equals("0127") ){
        Intent start = new Intent(this, pam.class
        );
        startActivity(start);
    }

    else if (txtuser.getText().toString().equals("kyle123") && txtpass.getText().toString().equals("3335") ){
        Intent start = new Intent(this, vincent.class
        );
        startActivity(start);
    }

    else if (txtuser.getText().toString().equals("jancarlos1001") && txtpass.getText().toString().equals("1001") ){
        Intent start = new Intent(this, jan.class
        );
        startActivity(start);
    }
        else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_LONG).show();
        }
}
}
