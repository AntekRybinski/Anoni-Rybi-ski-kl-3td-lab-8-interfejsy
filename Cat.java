package com.example.zwierzeta.model;

import android.content.Context;
import android.widget.Toast;

public class Cat implements Animal {

    public String getName() {
        return "Kot";
    }

    public void makeSound(Context context) {
        Toast.makeText(context, "Miaaaaał", Toast.LENGTH_SHORT).show();
    }
}