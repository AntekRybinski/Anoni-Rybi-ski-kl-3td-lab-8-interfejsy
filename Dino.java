package com.example.zwierzeta.model;

import android.content.Context;
import android.widget.Toast;

public class Dino implements Animal {

    public String getName() {
        return "Dinozaur";
    }

    public void makeSound(Context context) {
        Toast.makeText(context, "Rawrrrrrr", Toast.LENGTH_SHORT).show();
    }
}