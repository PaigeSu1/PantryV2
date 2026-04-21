package com.seproject.plantry.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seproject.plantry.R;
import com.seproject.plantry.database.PantryGroup;
import com.seproject.plantry.database.PantryItem;

import java.util.List;

/**
 * The adapter for pantry groups to be put into a RecyclerView
 */
public class PantryGroupAdapter extends RecyclerView.Adapter<PantryGroupAdapter.PantryGroupViewHolder> {

    private List<PantryGroup> items;

    public PantryGroupAdapter(List<PantryGroup> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public PantryGroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pantry, parent, false);
        return new PantryGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PantryGroupViewHolder holder, int position) {
        PantryGroup item = items.get(position);
        holder.name.setText(item.name);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class PantryGroupViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public PantryGroupViewHolder(@NonNull View groupView) {
            super(groupView);
            name = itemView.findViewById(R.id.item_name);
        }
    }

    /**
     * Set the contents of the items field
     * @param items The complete data to be held in the adapter
     */
    public void setItems(List<PantryGroup> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    /*
     * Manually add an item to the array (Only for testing purposes)
     */
    public void addItem(PantryGroup item) {
        items.add(item);
        notifyItemInserted(items.size() - 1);
    }
}