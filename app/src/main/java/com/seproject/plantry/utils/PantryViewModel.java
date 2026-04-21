package com.seproject.plantry.utils;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.Room;

import com.seproject.plantry.database.PantryDatabase;
import com.seproject.plantry.database.PantryGroup;
import com.seproject.plantry.database.PantryGroupDao;
import com.seproject.plantry.database.PantryItem;
import com.seproject.plantry.database.PantryItemDao;

import java.util.List;

/// The model. All db accessing should go in here
public class PantryViewModel extends ViewModel {
    private final PantryDatabase db;
    private final PantryGroupDao groupDao;
    private final PantryItemDao itemDao;

    public PantryViewModel(Application application) {
        db = Room.databaseBuilder(application, PantryDatabase.class, "pantry-db").build();
        groupDao = db.pantryGroupDao();
        itemDao = db.pantryItemDao();
    }

    public void addGroup(PantryGroup group) {
        groupDao.insert(group);
    }

    public LiveData<List<PantryGroup>> getGroups() {
        return groupDao.getAllItems();
    }

    public void addItem(PantryItem item) {
        itemDao.insert(item);
    }

    public LiveData<List<PantryItem>> getItems() {
        return itemDao.getAllItems();
    }
}
