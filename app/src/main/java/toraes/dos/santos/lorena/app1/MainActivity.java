package toraes.dos.santos.lorena.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); // Criando um botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { // setando o botão
            @Override
            public void onClick(View view) { // Criando um evento para clicar no botão
                EditText editText= findViewById(R.id.etDigiteAqui);
                String textoDigitado = editText.getText().toString(); // Armazenando um texto na variavel
                Intent i=new Intent(MainActivity.this,NextActivity.class); // Criando um intent i e linkando uma app com a outra
                i.putExtra("texto", textoDigitado);  // criando um dicionário
                startActivity(i);


            }
        });
    }
}