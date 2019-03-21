package com.phoenix.ouerfirstproject.ViewHolderAdapter;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.phoenix.ouerfirstproject.Model.Data;
import com.phoenix.ouerfirstproject.R;

import java.util.ArrayList;
import java.util.List;

class RecyclerviewHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;
    public TextView txtDescription;

    public RecyclerviewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = (ImageView)itemView.findViewById(R.id.imageview);
        txtDescription = (TextView)itemView.findViewById(R.id.txtDescription);
    }
}

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerviewHolder> {

    private List<Data> listData = new ArrayList<Data>();

    //Alt+insert


    public RecyclerViewAdapter(List<Data> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Change return null to Down
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.iteem,viewGroup,false);
        return new RecyclerviewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder recyclerviewHolder, int i) {
        recyclerviewHolder.imageView.setImageResource(listData.get(i).getImage());
        recyclerviewHolder.txtDescription.setText(listData.get(i).getTxt());
    }

    @Override
    public int getItemCount() {
        return listData.size();
        //Change from 0 to listData.size
    }
}
