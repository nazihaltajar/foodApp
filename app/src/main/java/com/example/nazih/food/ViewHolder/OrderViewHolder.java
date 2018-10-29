package com.example.nazih.food.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.nazih.food.Interface.ItemClickListener;
import com.example.nazih.food.R;

/**
 * Created by NAZIH on 16.01.2018.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAdress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txtOrderAdress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
