package com.syd.memories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText password = findViewById(R.id.password_edittext);
        Button button = findViewById(R.id.password_enter_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().equalsIgnoreCase("pepinillos")) {
                    Intent intent = new Intent(MainActivity.this, MemoriesActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
