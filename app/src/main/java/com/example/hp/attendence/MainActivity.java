package com.example.hp.attendence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToStudent(View view)
    {
        Intent intent = new Intent(this,studentActivity.class);
        startActivity(intent);
    }
    public void goToTeacher(View view)
    {
        Intent intent = new Intent(this,teacherActivity.class);
        startActivity(intent);
    }
}
