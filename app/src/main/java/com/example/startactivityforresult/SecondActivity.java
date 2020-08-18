package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.startactivityforresult.utils.Utils;

public class SecondActivity extends AppCompatActivity implements OnSubmitClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Utils.showDialog(this, (ViewGroup) findViewById(android.R.id.content));
    }

    @Override
    public void onSubmitClick(String message) {
        Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show();
    }
}