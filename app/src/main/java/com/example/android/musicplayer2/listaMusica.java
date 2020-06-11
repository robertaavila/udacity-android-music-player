package com.example.android.musicplayer2;

public class listaMusica{

    private String mMusica;

    private String mArtista;

    public listaMusica(String Musica, String Artista) {
        mMusica = Musica;
        mArtista = Artista;
    }

    public String getMusica() {
        return mMusica;
    }

    public String getArtista() {
        return mArtista;
    }

}