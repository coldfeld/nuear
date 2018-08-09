package com.kero.nuear;

import android.content.Intent;
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
        View.OnClickListener menuBtnOK = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.scales_button:
                        //Intent intent = new Intent()
                        break;
                    case R.id.chrom_button:
                        break;
                    case R.id.solfa_button:
                        break;
                    case R.id.settings_button:
                        Intent intent = new Intent(v.getContext(), settings.class);
                        startActivity(intent);
                        break;
                    case R.id.info_button:
                        break;
                        default:
                            break;
                }
            }
        };

        //-----------------//
        scales_btn.setOnClickListener(menuBtnOK);
        chroms_btn.setOnClickListener(menuBtnOK);
        solfa_btn.setOnClickListener(menuBtnOK);
        setting_btn.setOnClickListener(menuBtnOK);
        info_btn.setOnClickListener(menuBtnOK);
    }
}
