package com.kero.nuear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    ImageButton scales_btn, chroms_btn, solfa_btn, setting_btn, info_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //----------------//
        scales_btn = (ImageButton)findViewById(R.id.scales_button);
        chroms_btn = (ImageButton)findViewById(R.id.chrom_button);
        solfa_btn = (ImageButton)findViewById(R.id.solfa_button);
        setting_btn = (ImageButton)findViewById(R.id.settings_button);
        info_btn = (ImageButton)findViewById(R.id.info_button);
        //----------------//
        View.OnClickListener ScalesBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo
            }
        };
        View.OnClickListener ChromBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo

            }
        };
        View.OnClickListener SolfaBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo
            }
        };
        View.OnClickListener SettingBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo

            }
        };
        View.OnClickListener InfoBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo

            }
        };

        //-----------------//
        scales_btn.setOnClickListener(ScalesBtnOk);
        chroms_btn.setOnClickListener(ChromBtnOk);
        solfa_btn.setOnClickListener(SolfaBtnOk);
        setting_btn.setOnClickListener(SettingBtnOk);
        info_btn.setOnClickListener(InfoBtnOk);
    }
}
