package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
TextView fullname,phone,email,obj,acad1,acad2,acad3,acad4,pro,skills,lang;
  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_final);
    fullname=findViewById(R.id.r_fullname);
    phone=findViewById(R.id.r_phone);
    email=findViewById(R.id.r_emailid);
    obj=findViewById(R.id.r_obj);
    acad1=findViewById(R.id.r_acad1);
    acad2=findViewById(R.id.r_acad2);
    acad3=findViewById(R.id.r_acad3);
    acad4=findViewById(R.id.r_acad4);
    pro=findViewById(R.id.r_prodetails);
    skills=findViewById(R.id.r_skills);
    lang=findViewById(R.id.r_languages);
    Intent intent=getIntent();
    fullname.setText(intent.getStringExtra("Full Name"));
    phone.setText(intent.getStringExtra("Phone"));
    email.setText(intent.getStringExtra("Email ID"));
    obj.setText(intent.getStringExtra("Career Objectives"));
    acad1.setText("Passed "+intent.getStringExtra("PG Course Name")+" with "+intent.getStringExtra("PG Marks"));
    acad2.setText("Passed "+intent.getStringExtra("Graduate Course Name")+" with "+intent.getStringExtra("Graduate Marks"));
    acad3.setText("Passed Senior School with "+intent.getStringExtra("Senior School Marks"));
    acad4.setText("Passed High School with "+intent.getStringExtra("High School Marks"));
    pro.setText(intent.getStringExtra("Project Details"));
    skills.setText(intent.getStringExtra("Skills"));
    lang.setText(intent.getStringExtra("Languages Known"));

  }
}
