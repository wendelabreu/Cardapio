package com.example.cardapio.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardapio.R;
import com.example.cardapio.models.Pratos;

import java.util.List;

public class PratosAdapter extends RecyclerView.Adapter {

    private List<Pratos> pratos;
    private Context context;

    public PratosAdapter(List<Pratos> pratos, Context context) {
        this.pratos = pratos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_pratos, parent, false);
        PratosViewHolder holder = new PratosViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PratosViewHolder viewHolder = (PratosViewHolder) holder;

        Pratos prato = pratos.get (position);

        viewHolder.tipo.setText(prato.getTipo());
        viewHolder.nome.setText(prato.getNome());
        viewHolder.foto.setImageResource(prato.getFoto());

    }

    @Override
    public int getItemCount() {
        return pratos.size();
    }
}