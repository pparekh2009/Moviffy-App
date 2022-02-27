package com.priyanshparekh.registerapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.priyanshparekh.registerapp.R;

public class LoginActivity extends AppCompatActivity {

    Button loginBtn;
    EditText emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.login_btn_1);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);

        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, OtpActivity.class);
                startActivity(intent);
            }
        });
    }
}