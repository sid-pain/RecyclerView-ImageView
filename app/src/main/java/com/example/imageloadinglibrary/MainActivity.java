package com.example.imageloadinglibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyNumberData[] myNumberData = new MyNumberData[] {
                new MyNumberData("Number One", R.drawable.number_1),
                new MyNumberData("Number Two", R.drawable.number_2),
                new MyNumberData("Number Three", R.drawable.number_3),
                new MyNumberData("Number Four", R.drawable.number_4),
                new MyNumberData("Number Five", R.drawable.number_5),
                new MyNumberData("Number Six", R.drawable.number_6),
                new MyNumberData("Number Seven", R.drawable.number_7),
                new MyNumberData("Number Eight", R.drawable.number_8),
                new MyNumberData("Number Nine", R.drawable.number_9),
        };

        MyAdapter myAdapter = new MyAdapter(myNumberData, MainActivity.this);
        recyclerView.setAdapter(myAdapter);
    }
}