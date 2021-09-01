package com.example.btechdayspdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    private Context context;
    private List<File> pdfFiles;

    public MainAdapter(Context context, List<File> pdfFiles) {
        this.context = context;
        this.pdfFiles = pdfFiles;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.txtName.setText(pdfFiles.get(position).getName());
        holder.txtName.setSelected(true);
    }

    @Override
    public int getItemCount() {

        if(pdfFiles.size()!=0){
            return pdfFiles.size();
        }
        return  0;
    }
}
