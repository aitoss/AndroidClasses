package com.example.recycler_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    private RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView  = ( RecyclerView)findViewById(R.id.Recycler_view) ;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this) ;
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView .setLayoutManager(linearLayoutManager);


        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add( new ModelClass( R.drawable.ic_launcher_background, "shalini negi " , "btech"));
        modelClassList.add( new ModelClass( R.drawable.ic_launcher_background, " aman negi " , "betech" ));
        modelClassList.add( new ModelClass(   R.drawable.ic_launcher_background , "rashmi negi " , "job"));
        modelClassList.add( new ModelClass(   R.drawable.ic_launcher_background , " Ms negi " , "job"));
        modelClassList.add( new ModelClass( R.drawable.ic_launcher_background  , "Rajita negi " , "house wife" ));
        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();





    }
}
