package com.example.imageloadinglibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    MyNumberData[] myNumberData;
    Context context;

    public MyAdapter(MyNumberData[] myNumberData, MainActivity activity) {
        this.myNumberData = myNumberData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.image_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        final MyNumberData myNumberDataList = myNumberData[position];
        holder.textViewName.setText(myNumberDataList.getNumberName());
        holder.numberImage.setImageResource(myNumberDataList.getNumberImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myNumberDataList.getNumberName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myNumberData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView numberImage;
        TextView textViewName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            numberImage = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textName);
        }
    }
}
