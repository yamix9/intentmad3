package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


     EditText ednum1 , ednum2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //defining the texi obj
        ednum1 = findViewById(R.id.ednum1);
        ednum2 = findViewById(R.id.ednum2);


    }

    public void  OpenSecond(View view){

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",ednum1.getText().toString());
        intent.putExtra("n2",ednum2.getText().toString());

        //Toast.makeText(this,"Opening Calculator....",Toast.LENGTH_SHORT).show();
        startActivity(intent);
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

    
}