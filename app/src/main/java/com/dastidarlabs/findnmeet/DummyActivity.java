package com.dastidarlabs.findnmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DummyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);
    }

    private void done(View view){
        finish();
    }
}
