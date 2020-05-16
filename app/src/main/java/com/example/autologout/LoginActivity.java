package com.example.autologout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.autologout.sessionOut.BaseActivity;
import com.example.autologout.view.MainActivity;

public class LoginActivity extends BaseActivity {
    EditText name, password;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        name = (EditText) findViewById(R.id.editTextusername);
        password = (EditText) findViewById(R.id.editTextuserpassword);
        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}
