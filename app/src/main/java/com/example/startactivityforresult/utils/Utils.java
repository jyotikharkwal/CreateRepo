package com.example.startactivityforresult.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.startactivityforresult.MainActivity;
import com.example.startactivityforresult.OnSubmitClickListener;
import com.example.startactivityforresult.R;

public class Utils {
    private static OnSubmitClickListener clickListener;

    public static void showDialog(final Context context, ViewGroup parent) {
        clickListener = (OnSubmitClickListener) context;
        final Dialog dialog = new Dialog(context);
        View view = LayoutInflater.from(context)
                .inflate(R.layout.custom_dialog,parent, false);
        final EditText editText = view.findViewById(R.id.et_message);
        Button btnSubmit = view.findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                Toast.makeText(context, "Toast from dialog", Toast.LENGTH_SHORT).show();
                clickListener.onSubmitClick(message);
                dialog.dismiss();
            }
        });

        dialog.setContentView(view);
        dialog.show();
    }
}
