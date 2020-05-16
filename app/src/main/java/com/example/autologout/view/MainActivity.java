package com.example.autologout.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.autologout.R;
import com.example.autologout.sessionOut.BaseActivity;

public class MainActivity extends BaseActivity {
    EditText name, password;
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
