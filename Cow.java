package com.example.zwierzeta.model;

import android.content.Context;
import android.widget.Toast;

public class Cow implements Animal {

    public String getName() {
        return "Krówka";
    }

    public void makeSound(Context context) {
        Toast.makeText(context, "Muuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", Toast.LENGTH_SHORT).show();
    }
}