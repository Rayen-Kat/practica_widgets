package com.martinez.practica_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCalificar;
    private CheckBox checkbox;
    private RatingBar ratingBar;
    private RadioGroup rgGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalificar = findViewById(R.id.btnCalificar);
        checkbox = findViewById(R.id.checkbox);
        ratingBar = findViewById(R.id.ratingBar);
        rgGrupo = findViewById(R.id.rgGrupo);

        ratingBar.setEnabled(false);
        checkbox.setEnabled(false);
        btnCalificar.setEnabled(false);

        rgGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSi){
                    ratingBar.setEnabled(true);
                    checkbox.setEnabled(true);
                    btnCalificar.setEnabled(true);

                }else if (i == R.id.rbAlunas){
                    ratingBar.setEnabled(true);
                    checkbox.setEnabled(true);
                    btnCalificar.setEnabled(true);
                }else{
                    ratingBar.setRating(0);
                    ratingBar.setEnabled(false);
                    checkbox.setChecked(false);
                    checkbox.setEnabled(false);
                    btnCalificar.setEnabled(true);
                }
            }
        });
    }

    public void Calificar (View view){
        Toast.makeText(this, "Calificado", Toast.LENGTH_LONG).show();
    }

}