package com.example.smaik.appsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextName = findViewById(R.id.ma_name_et);
        EditText editTextSurname = findViewById(R.id.ma_surname_et);
        Button pushBtn = findViewById(R.id.ma_push_btn);

        pushBtn.setOnClickListener(view->{
            Intent intent = new Intent();
            intent.putExtra("name", editTextName.getText().toString());
            intent.putExtra("surname", editTextSurname.getText().toString());
            intent.setAction("NamePush");
            sendBroadcast(intent);
        });
    }
}
