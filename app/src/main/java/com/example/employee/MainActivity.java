package com.example.employee;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    AppCompatButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.empcode);
        e2=(EditText) findViewById(R.id.empname);
        e3=(EditText) findViewById(R.id.desg);
        e4=(EditText) findViewById(R.id.compname);
        e5=(EditText) findViewById(R.id.empsalary);
        e6=(EditText) findViewById(R.id.mobno);
        b1=(AppCompatButton) findViewById(R.id.regbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
            }
        });

    }
}