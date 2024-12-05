package com.example.toast217026648;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter=0;
    private TextView mshowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount=(TextView) findViewById(R.id.textView);
        if(mshowCount!=null){
            mshowCount.setText(Integer.toString(counter));
        }
}

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }
    public void Countup(View view) {
        ++counter;
            mshowCount.setText(Integer.toString(counter));
    }