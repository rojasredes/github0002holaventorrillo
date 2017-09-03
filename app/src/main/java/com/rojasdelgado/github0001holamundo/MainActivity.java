package com.rojasdelgado.github0002holaventorrillo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etiqueta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiqueta=(TextView)findViewById(R.id.etiqueta);
        etiqueta.setText("¡Hola, Ventorrillo!");
    }
}
