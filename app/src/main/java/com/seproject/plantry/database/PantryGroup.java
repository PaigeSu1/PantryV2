package com.seproject.plantry.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/// The type used for pantry groups (i.e., Apple, Potato, etc.) as opposed to a specific item (e.g., apples purchased on a particular date)
/// This maps to the database containing records with a name, perishability, and expiration date
@Entity(tableName = "pantry_groups")
public class PantryGroup {
    @NonNull
    @PrimaryKey
    public String name;
    public String category;
    /// Determines whether the expiration warning symbol will be shown at all
    public boolean perishable;
    /// The current state of the items contained within the group
    /// Should have one of three values: 'none', 'soon', or 'expired'
    /// 'none' should be used when there are no items that are expiring soon or have done so already
    /// 'soon' should be used if there is at least one item expiring soon and none that have already expired
    /// 'expired' should be used if there is at least one expired item
    public String expiryState;

    public PantryGroup(@NonNull String name, String category, boolean perishable, String expiryState) {
        this.name = name;
        this.category = category;
        this.perishable = perishable;
        this.expiryState = expiryState;
    }
}
