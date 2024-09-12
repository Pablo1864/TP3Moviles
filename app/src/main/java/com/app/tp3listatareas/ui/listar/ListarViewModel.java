package com.app.tp3listatareas.ui.listar;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.tp3listatareas.MainActivity;

import java.util.Collections;

public class ListarViewModel extends AndroidViewModel {

    private MutableLiveData<Boolean> listaOrdenadaBool;

    public ListarViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Boolean> getlistaOrdenadaBool() {
        if (listaOrdenadaBool == null){
            listaOrdenadaBool = new MutableLiveData<>();
        }
        return listaOrdenadaBool;
    }

    public void ordenarLista(){


        if (!MainActivity.notasLista.isEmpty()){
            Collections.sort(MainActivity.notasLista, String.CASE_INSENSITIVE_ORDER);
            listaOrdenadaBool.setValue(true);
        } else {
            Toast.makeText(getApplication(), "No hay notas guardadas.", Toast.LENGTH_LONG).show();

        }


    }
}