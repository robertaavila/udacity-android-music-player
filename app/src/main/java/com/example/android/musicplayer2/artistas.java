package com.example.android.musicplayer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class artistas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistas);

        TextView musicas = findViewById(R.id.musicas);
        musicas.setOnClickListener(new View.OnClickListener() {
                                       // The code in this method will be executed when the phrases category is clicked on.
                                       public void onClick(View view) {
                                           Intent musicasIntent = new Intent(artistas.this, musicas.class);
                                           startActivity(musicasIntent);
                                       }
                                   }
        );


        TextView tocandoAgora = findViewById(R.id.tocando_agora);
        tocandoAgora.setOnClickListener(new View.OnClickListener() {
                                            // The code in this method will be executed when the phrases category is clicked on.
                                            public void onClick(View view) {
                                                Intent tocandoAgoraIntent = new Intent(artistas.this, tocandoAgora.class);
                                                startActivity(tocandoAgoraIntent);

                                            }
                                        }
        );

    }
}
