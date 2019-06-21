package com.jimes.gesturelockview.gesturelockview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jimes.gesturelockview.guesturelockview.GestureLockThumbnailView;
import com.jimes.gesturelockview.guesturelockview.GestureLockView;
import com.jimes.gesturelockview.guesturelockview.listener.OnGestureLockListener;
import com.jimes.gesturelockview.guesturelockview.painter.AliPayPainter;

public class MainActivity extends AppCompatActivity {

    GestureLockThumbnailView gesThu;
    GestureLockView gesLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gesThu = findViewById(R.id.gesThu);
        gesLv = findViewById(R.id.gesLv);

        gesLv.setPainter(new AliPayPainter());
        gesLv.setGestureLockListener(new OnGestureLockListener() {
            @Override
            public void onStarted() {//解锁开始监听方法

            }

            @Override
            public void onProgress(String progress) {//解锁密码改变监听方法
                gesThu.setThumbnailView(progress,Color.BLUE);
            }

            @Override
            public void onComplete(String result) {//解锁完成监听方法

            }
        });

    }
}
