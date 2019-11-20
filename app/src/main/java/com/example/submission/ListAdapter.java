package com.example.submission;

import android.content.Context;
import android.content.Intent;
import android.graphics.Picture;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyListViewHolder>{

    private Context mContext;
    private ArrayList<Item> List_Item = new ArrayList<>();

    public ListAdapter(Context mContext, ArrayList<Item> list_Item) {
        this.mContext = mContext;
        List_Item = list_Item;
    }


    @NonNull
    @Override
    public MyListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_row, parent, false);
        return new MyListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyListViewHolder holder, int position) {
        Item m = List_Item.get(position);

        holder.Picture.setImageResource(Integer.valueOf(m.getPicture()));
        holder.Title.setText(String.valueOf(m.getName()));
        holder.Detail.setText(String.valueOf(m.getDetail()));
        holder.Position.setText(String.valueOf(position));
        Glide.with(holder.itemView.getContext())
                .load(List_Item.get(position).getPicture())
                .into(holder.Picture);

    }

    @Override
    public int getItemCount() {
        return List_Item.size();
    }

    public class MyListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView Picture;
        TextView Title, Detail, Position;

        public MyListViewHolder(@NonNull View itemView) {
            super(itemView);
            Picture = itemView.findViewById(R.id.img_item_photo);
            Title = itemView.findViewById(R.id.tv_item_title);
            Detail = itemView.findViewById(R.id.tv_item_detail);
            Position = itemView.findViewById(R.id.tv_item_position);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = Integer.parseInt(Position.getText().toString());
            String title = List_Item.get(position).getName();
            String detail = List_Item.get(position).getDetail();
            int picture = List_Item.get(position).getPicture();
            Toast.makeText(mContext, "Kamu Memilih" + " " + title, Toast.LENGTH_SHORT).show();

            Intent i = new Intent(v.getContext(), Detail.class);
            i.putExtra("Picture", picture);
            i.putExtra("Title", title);
            i.putExtra("Detail", detail);
            v.getContext().startActivity(i);
        }
    }

}


