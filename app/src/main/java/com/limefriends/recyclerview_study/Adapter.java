package com.limefriends.recyclerview_study;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<ChatElem> chatElemList = new ArrayList<ChatElem>();
    ImageView profImage;

    public Adapter(Context context, ArrayList<ChatElem> chatElemList) {
        this.context = context;
        this.chatElemList = chatElemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_e, parent, false);
        return new ViewHolder(view) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ChatElem chatElem = chatElemList.get(position);
        holder.name.setText(chatElem.getName());
        holder.content.setText(chatElem.getTextContent());
    }


    @Override
    public int getItemCount() {
        return chatElemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,content;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            content = itemView.findViewById(R.id.content);
            profImage = (ImageView) itemView.findViewById(R.id.profImage);

            profImage.setImageResource(R.drawable.soda1127);
        }
    }

}
