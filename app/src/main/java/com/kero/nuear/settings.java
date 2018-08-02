package com.kero.nuear;

import android.os.Bundle;
import android.app.Activity;
import android.support.constraint.ConstraintLayout;

public class settings extends Activity {

    ConstraintLayout lang_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
