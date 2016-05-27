package com.ami.thelastyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private long lastTime;
    @Override
    public void onBackPressed() {
        long ct=System.currentTimeMillis();
        if(ct-lastTime>2000){
            Toast.makeText(this,"再按返回键退出",Toast.LENGTH_LONG).show();
            lastTime=ct;
        }
        super.onBackPressed();
    }
}
