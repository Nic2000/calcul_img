package com.example.coach.vue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coach.R;
import com.example.coach.controleur.Controle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        this.controle = Controle.getInstance();
    }
    private EditText txtPoids;
    private EditText txtTaille;
    private EditText txtAge;
    private RadioButton rdHomme;
    private TextView lblResultat;
    private ImageView imgSmiley;
    private Controle controle;
    /**
     * initialisation des liens avec les objets graphiques
     */
    private void init(){
        txtPoids = (EditText) findViewById(R.id.txtPoids);
        txtTaille = (EditText) findViewById(R.id.txtTaille);
        txtAge = (EditText) findViewById(R.id.txtAge);
        rdHomme = (RadioButton) findViewById(R.id.rdHomme);
        lblResultat = (TextView) findViewById(R.id.lblResultat);
        imgSmiley = (ImageView) findViewById(R.id.imgSmiley);
        ecouteCalcul();
    }

    /**
     * Ecoute évènement sur le bouton calcul
     */
    private void ecouteCalcul(){
        ((Button) findViewById(R.id.btnCalcul)).setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"test",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
