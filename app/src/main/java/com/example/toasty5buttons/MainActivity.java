package com.example.toasty5buttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showtoast(View view)
    {
        switch (view.getId())
        {
            case R.id.error:
                Toasty.error(this,"Error",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.warning:
                Toasty.warning(this,"Warning",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.success:
                Toasty.success(this,"Success",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.info:
                Toasty.info(this,"Info",Toasty.LENGTH_SHORT).show();
                break;
            case R.id.image:

                Toasty.normal(this,"Image",Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_android_black_24dp)).show();
                break;
        }
    }
}
