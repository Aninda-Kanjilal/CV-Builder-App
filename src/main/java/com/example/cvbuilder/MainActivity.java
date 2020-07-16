package com.example.cvbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText name,add1,add2,phone,email;
  Button next;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    name=findViewById(R.id.fullname);
    add1=findViewById(R.id.address1);
    add2=findViewById(R.id.address2);
    phone=findViewById(R.id.phn);
    email=findViewById(R.id.mail);
    next=findViewById(R.id.next1);
    next.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
       String fname=name.getText().toString();
       String address1=add1.getText().toString();
       String address2=add2.getText().toString();
       String phn=phone.getText().toString();
       String mail=email.getText().toString();
       if(fname.equals(""))
       {
         Toast.makeText(MainActivity.this,"Full Name is missing",Toast.LENGTH_SHORT).show();
       }
       else if(address1.equals(""))
       {
         Toast.makeText(MainActivity.this,"Address Line 1 is missing",Toast.LENGTH_SHORT).show();
       }
       else if(address2.equals(""))
       {
         Toast.makeText(MainActivity.this,"Address Line 2 is missing",Toast.LENGTH_SHORT).show();
       }
       else if(phn.equals(""))
       {
         Toast.makeText(MainActivity.this,"Phone Number is missing",Toast.LENGTH_SHORT).show();
       }
       else if(mail.equals(""))
       {
         Toast.makeText(MainActivity.this,"Email ID is missing",Toast.LENGTH_SHORT).show();
       }
       else
       {
         Intent main_final=new Intent(MainActivity.this,AcademicActivity.class);
         main_final.putExtra("Full Name",fname);
         main_final.putExtra("Address 1",address1);
         main_final.putExtra("Address 2",address2);
         main_final.putExtra("Phone",phn);
         main_final.putExtra("Email ID",mail);
         startActivity(main_final);
       }
      }
    });
  }
}
