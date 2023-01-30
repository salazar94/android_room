package com.example.festimusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
/**
 * en este ejemplo se utiliza
 * un LinearLayout que es un tipo de vista
 * utilizando en los componentes hijos(views)
 * puedes ser horizontal o vertical
 * la propiedad android:layout_weight="1"
 * para hacer algo similar flex, tener en cuenta
 * que este tipo de propiedades consumen muchos
 * recursos
 */