package com.seproject.plantry.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


/**
 * The dao for pantry groups
 */
@Dao
public interface PantryGroupDao {
    @Insert
    void insert(PantryGroup group);

    @Update
    void update(PantryGroup group);

    @Delete
    void delete(PantryGroup group);

    @Query("SELECT * FROM pantry_groups")
    LiveData<List<PantryGroup>> getAllItems();
}