package toraes.dos.santos.lorena.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Set;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent();  // Pega o intent que iniciou essa activity e o guarda na variavel i
        String textodigitado = i.getStringExtra("texto");  // Pegando o valor do dicionário que foi criado no mainActivity
        TextView tvtexto = findViewById(R.id.tvTexto); // Pega pra mim o elemento de interface localizado no id.tvtexto
        tvtexto.setText(textodigitado);
    }
}