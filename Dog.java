package com.example.zwierzeta.model;

import android.content.Context;
import android.widget.Toast;

public class Dog implements Animal {

    public String getName() {
        return "Pies";
    }

    public void makeSound(Context context) {
        Toast.makeText(context, "Hau hau", Toast.LENGTH_SHORT).show();
    }
}