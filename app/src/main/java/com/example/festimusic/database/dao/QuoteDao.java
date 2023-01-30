package com.example.festimusic.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.festimusic.database.Entity.QuoteEntity;

import java.util.List;

@Dao
public interface QuoteDao {

    @Query("select * from quotes")
    public List<QuoteEntity> getAllQuotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(QuoteEntity... quote);
}

