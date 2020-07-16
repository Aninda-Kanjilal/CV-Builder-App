package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CareerActivity extends AppCompatActivity {
  EditText objectives,projects,skills,languages;
  Button finish;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_career);
    Intent intent1=getIntent();
    final String fname=intent1.getStringExtra("Full Name");
    final String phn=intent1.getStringExtra("Phone");
    final String mail=intent1.getStringExtra("Email ID");
    final String pgcourse=intent1.getStringExtra("PG Course Name");
    final String graduatecourse=intent1.getStringExtra("Graduate Course Name");
    final String pgmarks=intent1.getStringExtra("PG Marks");
    final String graduatemarks=intent1.getStringExtra("Graduate Marks");
    final String ssmarks=intent1.getStringExtra("Senior School Marks");
    final String hsmarks=intent1.getStringExtra("High School Marks");

    objectives=findViewById(R.id.obj);
    projects=findViewById(R.id.pro_details);
    skills=findViewById(R.id.skills);
    languages=findViewById(R.id.lang);
    finish=findViewById(R.id.finish);
    finish.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String obj = objectives.getText().toString();
        String pro=projects.getText().toString();
        String skill=skills.getText().toString();
        String lang=languages.getText().toString();
        if(obj.equals(""))
        {
          Toast.makeText(CareerActivity.this,"Career Objectives is missing",Toast.LENGTH_SHORT).show();
        }
        else if(pro.equals(""))
        {
          Toast.makeText(CareerActivity.this,"Project Details is missing",Toast.LENGTH_SHORT).show();
        }
        else if(skill.equals(""))
        {
          Toast.makeText(CareerActivity.this,"Skills are missing",Toast.LENGTH_SHORT).show();
        }
        else if(lang.equals(""))
        {
          Toast.makeText(CareerActivity.this,"Languages Known  is missing",Toast.LENGTH_SHORT).show();
        }
        else
        {
          Intent career_final=new Intent(CareerActivity.this,FinalActivity.class);
          career_final.putExtra("Full Name",fname);
          career_final.putExtra("Phone",phn);
          career_final.putExtra("Email ID",mail);
          career_final.putExtra("PG Course Name",pgcourse);
          career_final.putExtra("Graduate Course Name",graduatecourse);
          career_final.putExtra("PG Marks",pgmarks);
          career_final.putExtra("Graduate Marks",graduatemarks);
          career_final.putExtra("Senior School Marks",ssmarks);
          career_final.putExtra("High School Marks",hsmarks);
          career_final.putExtra("Career Objectives",obj);
          career_final.putExtra("Project Details",pro);
          career_final.putExtra("Skills",skill);
          career_final.putExtra("Languages Known",lang);
          startActivity(career_final);
        }
      }
    });
  }
}
