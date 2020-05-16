package com.example.autologout.sessionOut;

import android.app.Application;

import java.util.Timer;
import java.util.TimerTask;

public class MyApp extends Application {

    Timer timer;
    LogOutListener logOutListener;

    public void startUserSession() {
        cancelTimer();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                logOutListener.onSessionLogout();
            }
        }, 60000); // ONE MINUTE FOR  LOG OUT
    }

    public void cancelTimer() {
        if (timer != null) timer.cancel();
    }

    public void registerSessionListener(LogOutListener logOutListener) {

        this.logOutListener = logOutListener;
    }

    public void onUserIntracted() {
        startUserSession();
    }
}
