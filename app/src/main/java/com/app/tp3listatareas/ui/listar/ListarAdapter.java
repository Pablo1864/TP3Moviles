package com.app.tp3listatareas.ui.listar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.tp3listatareas.R;

import java.util.List;

public class ListarAdapter extends RecyclerView.Adapter<ListarAdapter.ViewHolderListar> {

    private List<String> listaItems;
    private LayoutInflater layoutInflater;


    public ListarAdapter(List<String> listaItems, LayoutInflater layoutInflater) {
        this.listaItems = listaItems;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public ViewHolderListar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.item_lista_notas, parent, false);
        return new ViewHolderListar(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderListar holder, int position) {

        holder.tvItem.setText(listaItems.get(position));
    }

    @Override
    public int getItemCount() {

        return listaItems.size();
    }


    public class ViewHolderListar extends RecyclerView.ViewHolder {

        TextView tvItem;

        public ViewHolderListar(@NonNull View itemView) {
            super(itemView);

            tvItem = itemView.findViewById(R.id.editNotas);  // Asegúrate de que 'tvNote' es el id del TextView en card_note.xml
        }
    }
}


