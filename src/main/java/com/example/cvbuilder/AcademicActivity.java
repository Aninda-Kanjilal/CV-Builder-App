package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressWarnings("WeakerAccess")
public class AcademicActivity extends AppCompatActivity {
  EditText course1,course2,marks1,marks2,marks3,marks4;
  Button next;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_academic);
    Intent intent1=getIntent();
    final String fname=intent1.getStringExtra("Full Name");
    final String phn=intent1.getStringExtra("Phone");
    final String mail=intent1.getStringExtra("Email ID");

    course1=findViewById(R.id.pgcourse);
    course2=findViewById(R.id.graduatecourse);
    marks1=findViewById(R.id.pgmarks);
    marks2=findViewById(R.id.graduatemarks);
    marks3=findViewById(R.id.ssmarks);
    marks4=findViewById(R.id.hsmarks);
    next=findViewById(R.id.next2);
    next.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String pgcourse=course1.getText().toString();
        String graduatecourse=course2.getText().toString();
        String pgmarks=marks1.getText().toString();
        String graduatemarks=marks2.getText().toString();
        String hsmarks=marks3.getText().toString();
        String ssmarks=marks4.getText().toString();
        if(pgcourse.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"PG Course Name is missing",Toast.LENGTH_SHORT).show();
        }
        else if(graduatecourse.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"Graduate Course Name is missing",Toast.LENGTH_SHORT).show();
        }
        else if(pgmarks.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"PG Marks is missing",Toast.LENGTH_SHORT).show();
        }
        else if(graduatemarks.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"Graduate Marks is missing",Toast.LENGTH_SHORT).show();
        }
        else if(ssmarks.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"Senior School Marks is missing",Toast.LENGTH_SHORT).show();
        }
        else if(hsmarks.equals(""))
        {
          Toast.makeText(AcademicActivity.this,"High School Marks is missing",Toast.LENGTH_SHORT).show();
        }
        else
        {
          Intent acad_final=new Intent(AcademicActivity.this,CareerActivity.class);
          acad_final.putExtra("Full Name",fname);
          acad_final.putExtra("Phone",phn);
          acad_final.putExtra("Email ID",mail);
          acad_final.putExtra("PG Course Name",pgcourse);
          acad_final.putExtra("Graduate Course Name",graduatecourse);
          acad_final.putExtra("PG Marks",pgmarks);
          acad_final.putExtra("Graduate Marks",graduatemarks);
          acad_final.putExtra("Senior School Marks",ssmarks);
          acad_final.putExtra("High School Marks",hsmarks);
          startActivity(acad_final);
        }
      }
    });
  }
}
