package com.example.android.musicplayer2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class listaMusicaAdapter extends ArrayAdapter<listaMusica> {

    public listaMusicaAdapter(Activity context, ArrayList<listaMusica> listadeMusica) {
        super(context, 0, listadeMusica);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_lista, parent, false);
        }

        listaMusica currentlistaMusica = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Musica);
        nameTextView.setText(currentlistaMusica.getMusica());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.Artista);
        numberTextView.setText(currentlistaMusica.getArtista());

        return listItemView;
    }

}
