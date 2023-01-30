package com.example.festimusic.database;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.RoomDatabase;

import com.example.festimusic.database.Entity.QuoteEntity;
import com.example.festimusic.database.dao.QuoteDao;

@Database(entities = {QuoteEntity.class}, version = 1,exportSchema = false)
public abstract class QuoteDatabase extends RoomDatabase {
    public abstract QuoteDao getQuoteDao();
}
