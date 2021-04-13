package com.xiaojian.javadesignpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.xiaojian.javadesignpatterns.singleton.DoubleCheckedLockingLazySingleton;
import com.xiaojian.javadesignpatterns.singleton.EnumSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}