package com.daniel.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner Tracks;
    EditText LastName, FirstName, MiddleName;
    RadioButton rbMale, rbFemale;
    CheckBox c4, c3, c2, c1;
    Button btn;


    String academicProgram, LN, FN, MN, G, Req;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Tracks = findViewById(R.id.spn);
        LastName = findViewById(R.id.LName);
        FirstName = findViewById(R.id.FName);
        MiddleName = findViewById(R.id.MName);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        c1 = findViewById(R.id.cb1);
        c2 = findViewById(R.id.cb2);
        c3 = findViewById(R.id.cb3);
        c4 = findViewById(R.id.cb4);
    }

    public void ST(View view) {

        academicProgram = Tracks.getSelectedItem().toString();
        LN= LastName.getText().toString();
        FN = FirstName.getText().toString();
        MN = MiddleName.getText().toString();

        if(rbMale.isChecked()) {
            G = "Male";
        }
        else {
            G = "Female";
        }

        Req = "";
        if(c1.isChecked()) {
            Req = c1.getText().toString() + "\n";
        }
        if(c2.isChecked()) {
            Req =  Req + c2.getText().toString() + "\n";
        }
        if(c3.isChecked()) {
            Req =  Req + c3.getText().toString() + "\n";
        }
        if(c4.isChecked()) {
            Req = Req+ c4.getText().toString() + "\n";

        }


        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("academicProgram", academicProgram);
        intent.putExtra("lastname", LN);
        intent.putExtra("firstname", FN);
        intent.putExtra("middlename", MN);
        intent.putExtra("gender", G);
        intent.putExtra("checkbox",  Req);
        startActivity(intent);



    }
}