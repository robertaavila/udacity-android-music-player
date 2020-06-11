package com.example.android.musicplayer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class musicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicas);

        TextView artistas = findViewById(R.id.artistas);

        artistas.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            Intent artistasIntent = new Intent(musicas.this, artistas.class);
                                            startActivity(artistasIntent);
                                        }
                                    }
        );

        TextView tocandoAgora = findViewById(R.id.tocando_agora);
        tocandoAgora.setOnClickListener(new View.OnClickListener() {
                                            // The code in this method will be executed when the phrases category is clicked on.
                                            public void onClick(View view) {
                                                Intent tocandoAgoraIntent = new Intent(musicas.this, tocandoAgora.class);
                                                startActivity(tocandoAgoraIntent);

                                            }
                                        }
        );

        ArrayList<listaMusica> listadeMusica = new ArrayList<listaMusica>();
        listadeMusica.add(new listaMusica("A Bossa Nova É Foda - 3:53", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Um Abraçaço - 3:49", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Estou Triste - 5:12", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("O Império da Lei - 4:06", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Quero Ser Justo - 3:52", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Um Comunista - 8:32", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Funk Melódico - 4:38", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Vinco - 5:39", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Quando o Galo Cantou - 3:46", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Parabéns (Caetano Veloso, Mauro Lima) - 3:06", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Outro - 3:00", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Minhas Lágrimas - 5:09", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Rocks - 3:36", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Deusa Urbana - 3:46", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Waly Salomão - 3:24", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Não Me Arrependo - 4:08", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Musa Híbrida - 4:21", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Odeio - 5:58", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Porquê? - 3:53", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Um Sonho - 3:23", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("O Herói - 3:44", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Perdeu - 6:49", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Sem Cais - 2:36", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Por Quem? - 5:43", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Lobão Tem Razão - 4:05", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("A Base de Guantánamo - 4:25", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Falso Leblon - 2:42", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Incompatibilidade de Gênios - 5:24", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Ingenuidade - 3:54", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Menina da Ria - 2:19", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Parabéns (Caetano Veloso, Mauro Lima) - 3:06", "Caetano Veloso"));
        listadeMusica.add(new listaMusica("Gayana (Rogério Duarte) - 4:30", "Caetano Veloso"));

        listaMusicaAdapter MusicasAdapter = new listaMusicaAdapter(this, listadeMusica);
        ListView listView = findViewById(R.id.lista_musicas);
        listView.setAdapter(MusicasAdapter);
    }
}
