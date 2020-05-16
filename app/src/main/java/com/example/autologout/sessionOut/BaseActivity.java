package com.example.autologout.sessionOut;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.autologout.LoginActivity;

public class BaseActivity extends AppCompatActivity implements LogOutListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApp) getApplication()).registerSessionListener(this);
        ((MyApp) getApplication()).startUserSession();
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        ((MyApp) getApplication()).onUserIntracted();
    }

    @Override
    public void onSessionLogout() {
        //finish();
        Intent intent = new Intent(BaseActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ((MyApp) getApplication()).cancelTimer();
        ((MyApp) getApplication()).startUserSession();
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((MyApp) getApplication()).cancelTimer();
        ((MyApp) getApplication()).startUserSession();
    }
}
