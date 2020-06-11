package com.example.android.musicplayer2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistas = findViewById(R.id.artistas);

        artistas.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View view) {
                                            Intent artistasIntent = new Intent(MainActivity.this, artistas.class);
                                            startActivity(artistasIntent);
                                        }
                                    }
        );

        TextView musicas = findViewById(R.id.musicas);
        musicas.setOnClickListener(new View.OnClickListener() {
                                       // The code in this method will be executed when the phrases category is clicked on.
                                       public void onClick(View view) {
                                           Intent musicasIntent = new Intent(MainActivity.this, musicas.class);
                                           startActivity(musicasIntent);
                                       }
                                   }
        );


        TextView tocandoAgora = findViewById(R.id.tocando_agora);
        tocandoAgora.setOnClickListener(new View.OnClickListener() {
                                            // The code in this method will be executed when the phrases category is clicked on.
                                            public void onClick(View view) {
                                                Intent tocandoAgoraIntent = new Intent(MainActivity.this, tocandoAgora.class);
                                                startActivity(tocandoAgoraIntent);

                                            }
                                        }
        );

    }


}
