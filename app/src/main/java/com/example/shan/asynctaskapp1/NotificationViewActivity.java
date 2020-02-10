package com.example.shan.asynctaskapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationViewActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);

        textView = findViewById(R.id.textView);
        //getting the notification message
        String message=getIntent().getStringExtra("message");
        textView.setText(message + "...addition");
    }
}
