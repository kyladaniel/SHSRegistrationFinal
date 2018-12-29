package com.daniel.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {


    TextView AcademicProgram, FullName, Gender, checkbox;

    String academicProgram, gender, requirements, full_name;
    String  lastname, firstname, middlename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        AcademicProgram = findViewById(R.id.tvAcademicProgram);
        FullName = findViewById(R.id.tvFullName);
        Gender = findViewById(R.id.tvGender);
        checkbox = findViewById(R.id.tvRequirements);



        Intent intent = getIntent();
        academicProgram = intent.getStringExtra("academicProgram");
        lastname = intent.getStringExtra("lastname");
        firstname = intent.getStringExtra("firstname");
        middlename = intent.getStringExtra("middlename");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("checkbox");

        full_name = firstname + " " + middlename + " " + lastname;

        AcademicProgram.setText(academicProgram);
        FullName.setText(full_name);
        Gender.setText(gender);
        checkbox.setText(requirements);


    }
}
