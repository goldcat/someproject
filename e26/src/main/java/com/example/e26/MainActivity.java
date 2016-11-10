package com.example.e26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.b);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long endTime=System.currentTimeMillis()+10*1000;//10秒
                while (System.currentTimeMillis()<endTime){
                    synchronized (this){
                        try {
                            wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
