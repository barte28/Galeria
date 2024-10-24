package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> obrazki = new ArrayList<>();
    private Button buttonCofnij;
    private Button buttonNastepne;
    ImageView imageView;
    int licznik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazki.add(R.drawable.cat686567_640);
        obrazki.add(R.drawable.giraffe6931712_640);
        obrazki.add(R.drawable.lemur6830492_640);
        obrazki.add(R.drawable.lotus5461214_640);
        obrazki.add(R.drawable.ox6931801_640);

        imageView = findViewById(R.id.imageView);

        buttonNastepne = findViewById(R.id.button2);
        buttonNastepne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (licznik == 4){
                    licznik = 0;
                    imageView.setImageResource(obrazki.get(licznik));
                }
                else{
                    licznik++;
                    imageView.setImageResource(obrazki.get(licznik));
                }
            }
        });

        buttonCofnij = findViewById(R.id.button);
        buttonCofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (licznik == 0){
                    licznik = 4;
                    imageView.setImageResource(obrazki.get(licznik));
                }
                else{
                    licznik--;
                    imageView.setImageResource(obrazki.get(licznik));
                }
            }
        });
    }
}