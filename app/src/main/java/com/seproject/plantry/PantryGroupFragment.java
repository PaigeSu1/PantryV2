package com.seproject.plantry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.appbar.MaterialToolbar;
import com.seproject.plantry.adapter.PantryItemAdapter;
import com.seproject.plantry.database.PantryDatabase;
import com.seproject.plantry.database.PantryItem;
import com.seproject.plantry.database.PantryItemDao;

import java.util.ArrayList;

/// The fragment that lets the user view all the items in a particular group
public class PantryGroupFragment extends Fragment {
    public PantryGroupFragment() {
        super(R.layout.fragment_group_pantry);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_group_pantry, container, false);
        MaterialToolbar toolbar = root.findViewById(R.id.pantry_group_toolbar);
        NavController navController = NavHostFragment.findNavController(this);
        NavigationUI.setupWithNavController(toolbar, navController);

        return root;
    }
}
