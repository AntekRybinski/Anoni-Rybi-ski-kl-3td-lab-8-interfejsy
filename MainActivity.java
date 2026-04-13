package com.example.zwierzeta;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;

import com.example.zwierzeta.adapter.AnimalAdapter;
import com.example.zwierzeta.model.*;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    List<Animal> list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        list = new ArrayList<>();
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Cow());
        list.add(new Dino());


        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new AnimalAdapter(list, this));
    }
}