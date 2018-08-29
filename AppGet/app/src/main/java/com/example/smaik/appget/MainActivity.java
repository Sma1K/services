package com.example.smaik.appget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTv = findViewById(R.id.ma_name_tv);
        TextView surnameTv = findViewById(R.id.ma_surname_tv);
        nameTv.setText(getIntent().getStringExtra("name"));
        surnameTv.setText(getIntent().getStringExtra("surname"));
    }
}
