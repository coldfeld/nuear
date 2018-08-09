package com.kero.nuear;

import android.os.Bundle;
import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.view.View;

import fr.tvbarthel.lib.blurdialogfragment.BlurDialogFragment;

public class settings extends Activity {
    BlurDialogFragment sd1;
    ConstraintLayout lang_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        sd1 = new SampleDialogFragment();
        lang_button = findViewById(R.id.lang_setting);

    }
    @Override
    protected void onResume() {
        super.onResume();
        lang_button = findViewById(R.id.lang_setting);
        View.OnClickListener lang_buttonz = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sd1.show(getFragmentManager(), "sd1");
            }
        };
        lang_button.setOnClickListener(lang_buttonz);
    }

}
