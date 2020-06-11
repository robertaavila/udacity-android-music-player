package com.example.android.musicplayer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class tocandoAgora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tocando_agora);

        TextView artistas = findViewById(R.id.artistas);

        artistas.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            Intent artistasIntent = new Intent(tocandoAgora.this, artistas.class);
                                            startActivity(artistasIntent);
                                        }
                                    }
        );

        TextView musicas = findViewById(R.id.musicas);
        musicas.setOnClickListener(new View.OnClickListener() {
                                       // The code in this method will be executed when the phrases category is clicked on.
                                       public void onClick(View view) {
                                           Intent musicasIntent = new Intent(tocandoAgora.this, musicas.class);
                                           startActivity(musicasIntent);
                                       }
                                   }
        );

    }
}
