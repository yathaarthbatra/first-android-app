package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    private Button button; // to store the button variable
    private TextView textView; // to store the wight to be shown in pounds
    private EditText editText; //to store the content of Kg


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView2); // weight shown in pounds
        editText=findViewById(R.id.editText3);  //kg wala Text

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(context:MainActivity.this,text:"CLick worked",Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textView.setText("The Corresponding Value in Pounds is " + pound);
            }
        });

    }





}
