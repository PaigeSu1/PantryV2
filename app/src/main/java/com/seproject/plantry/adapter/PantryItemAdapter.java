package com.seproject.plantry.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seproject.plantry.R;
import com.seproject.plantry.database.PantryItem;

import java.util.List;


public class PantryItemAdapter extends RecyclerView.Adapter<PantryItemAdapter.PantryViewHolder> {

    private List<PantryItem> items;

    public PantryItemAdapter(List<PantryItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public PantryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pantry, parent, false);
        return new PantryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PantryViewHolder holder, int position) {
        PantryItem item = items.get(position);
        holder.quantity.setText(String.valueOf(item.quantity));
        holder.buy.setText(String.valueOf(item.buyDate));
        holder.expiration.setText(String.valueOf(item.expirationDate));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class PantryViewHolder extends RecyclerView.ViewHolder {
        TextView quantity, buy, expiration;

        public PantryViewHolder(@NonNull View itemView) {
            super(itemView);
            quantity = itemView.findViewById(R.id.item_quantity);
            buy = itemView.findViewById(R.id.item_buy_date);
            expiration = itemView.findViewById(R.id.item_expiration_date);
        }
    }

    public void setItems(List<PantryItem> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    /*
    * Manually add an item to the array (Only for testing purposes)
    */
    public void addItem(PantryItem item) {
        items.add(item);
        notifyItemInserted(items.size() - 1);
    }
}