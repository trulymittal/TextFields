package com.example.killer.textfields;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout textInputLayout = findViewById(R.id.textInputLayout);
        boolean isValid = false;
        if (isValid) {
            textInputLayout.setError(null);
        } else {
            textInputLayout.setError("you have entered wrong info.");
        }
    }
}
