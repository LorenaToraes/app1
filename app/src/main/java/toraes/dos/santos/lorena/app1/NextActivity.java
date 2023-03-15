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
        Intent i = getIntent();
        String textodigitado = i.getStringExtra("texto");
        TextView tvtexto = findViewById(R.id.tvTexto);
        tvtexto.setText(textodigitado);
    }
}