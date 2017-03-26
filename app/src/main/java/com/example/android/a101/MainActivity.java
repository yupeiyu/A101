package com.example.android.a101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;

//播照片
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        b1=(ImageButton)findViewById(R.id.imageButton1);
        b2=(ImageButton)findViewById(R.id.imageButton2);
        b3=(ImageButton)findViewById(R.id.imageButton3);
        b4=(ImageButton)findViewById(R.id.imageButton4);
        b5=(ImageButton)findViewById(R.id.imageButton5);
        b6=(ImageButton)findViewById(R.id.imageButton6);
        b7=(ImageButton)findViewById(R.id.imageButton7);
        b8=(ImageButton)findViewById(R.id.imageButton8);
        b9=(ImageButton)findViewById(R.id.imageButton9);
        b10=(ImageButton)findViewById(R.id.imageButton10);
        b11=(ImageButton)findViewById(R.id.imageButton11);
        b12=(ImageButton)findViewById(R.id.imageButton12);
        b13=(ImageButton)findViewById(R.id.imageButton13);
        //listener
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton1:
            case R.id.imageButton2:
            case R.id.imageButton3:
            case R.id.imageButton4:
            case R.id.imageButton5:
            case R.id.imageButton6:
            case R.id.imageButton7:
            case R.id.imageButton8:
            case R.id.imageButton9:
            case R.id.imageButton10:
            case R.id.imageButton11:
            case R.id.imageButton12:


                v.setVisibility(View.GONE);//圖可見度 消失 按誰誰消失
                break;

            case R.id.imageButton13:

                v.setVisibility(View.GONE);
                //把前面13張找回來

                b13.setVisibility(View.VISIBLE);
                b12.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                break;
        }
    }
}
