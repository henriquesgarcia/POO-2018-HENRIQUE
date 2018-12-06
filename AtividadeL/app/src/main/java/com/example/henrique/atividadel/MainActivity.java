package com.example.henrique.atividadel;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtNumeroExibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // binding
        setupViews();
    }

    public void mostrarToast(View view) {

        Toast.makeText(this, R.string.mensagem_toast, Toast.LENGTH_SHORT).show();
    }

    public void aumentarValor(View view) {

        int numero = Integer.parseInt(txtNumeroExibido.getText().toString());
        numero++;

        if (numero > 5){

            numero = 5;
            Snackbar
                    .make(view,R.string.mensagem_snackbar_aumentar,1500)
                    .show();
        }

        txtNumeroExibido.setText(String.valueOf(numero));

    }

    public void diminuirValor(View view) {

        int numero = Integer.parseInt(txtNumeroExibido.getText().toString());
        numero--;

        if (numero < 0){
            numero = 0;
            Snackbar
                    .make(view,R.string.mensagem_snackbar_diminuir,1500)
                    .show();
        }

        txtNumeroExibido.setText(String .valueOf(numero));
    }

    public void setupViews() {
        txtNumeroExibido = findViewById(R.id.txt_numero_exibido);
    }

}
