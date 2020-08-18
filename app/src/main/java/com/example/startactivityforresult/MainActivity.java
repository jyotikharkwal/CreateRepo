package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.startactivityforresult.utils.Utils;

public class MainActivity extends AppCompatActivity implements OnSubmitClickListener {
    TextView mMsg;
    Button mGetMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMsg = (TextView) findViewById(R.id.tv_getmsg);
        mGetMsg = (Button) findViewById(R.id.btn_getmsg);
        mGetMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, DialogBox.class);
                startActivityForResult(intent, 2);*/
//                Utils.showDialog(MainActivity.this, (ViewGroup) findViewById(android.R.id.content));
                Utils.showDialog(MainActivity.this, (ViewGroup) findViewById(android.R.id.content));

            }
        });
    }

    @Override
    public void onSubmitClick(String message) {
        Toast.makeText(this, "Toast from Main: "+message, Toast.LENGTH_SHORT).show();

        mMsg.setText(message);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2) {
            String message = data.getStringExtra("MESSAGE");
            mMsg.setText(message);
        }
    }*/
}