package com.brillicaservices.coffeeshop;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText;
    EditText editText2;
    RadioGroup rg;
    RadioButton rb1,rb2;
    EditText et;
    int quantity;
    int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        rg =(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        et = (EditText) findViewById(R.id.editText3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                int capacity = Integer.parseInt(editText2.getText().toString());
                if(rb1.isChecked())
                {
                    quantity=10;
                }
                else if(rb2.isChecked())
                {
                    quantity=15;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please check radio button or get lost xcz", Toast.LENGTH_SHORT).show();
                }
                price=quantity*capacity;
                Toast.makeText(getApplicationContext(),""+price,Toast.LENGTH_LONG).show();
            }
        });
        }
    }
