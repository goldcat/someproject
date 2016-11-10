package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] array={"小米","华为","魅族","锤子"};
        ListView list=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter=new
                ArrayAdapter<String>(this,R.layout.item,array);
        list.setAdapter(adapter);
    }
}
