package com.example.appname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] title={
            "Vlc media player",
            "Visual code",



    };

    String[] description={
            "Catagory",
            "Catagory",


    };

    Integer[] imgs = {
            R.drawable.vlc,
            R.drawable.visual,

    };
    ListView listView1;

    String[] tit={
            "CCleaner",
            "7Zip ",
            "Visual Code ",
            "Vlc media player ",


    };

    String[] des={
          "Catagory",
            "Catagory",
            "Catagory",
            "Catagory",

    };


    Integer[] img = {
            R.drawable.cc,
            R.drawable.zip,
            R.drawable.visual,
            R.drawable.vlc,
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MylistAdapter adapter = new MylistAdapter(this,title,description,imgs);

        listView = findViewById(R.id.recent);
        listView.setAdapter(adapter);

        MylistAdapter adapter1 = new MylistAdapter(this,tit,des,img);
        listView1 = findViewById(R.id.all);
        listView1.setAdapter(adapter1);





    }
}
