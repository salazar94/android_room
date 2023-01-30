package com.example.festimusic.di;

import android.content.Context;

import androidx.room.Room;

import com.example.festimusic.database.QuoteDatabase;
import com.example.festimusic.database.dao.QuoteDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public abstract class RoomModule {
    final static String DATABASE_NAME = "quote_database";
    static QuoteDatabase quoteDatabase;



    @Singleton
    @Provides
    public static QuoteDatabase provideRoom(@ApplicationContext Context context) {
        Class<QuoteDatabase> c = QuoteDatabase.class;
        return Room.databaseBuilder(context.getApplicationContext(), QuoteDatabase.class, DATABASE_NAME).allowMainThreadQueries().build();
    }

    @Singleton
    @Provides
    public static QuoteDao provideQuoteDao(QuoteDatabase db) {
        return db.getQuoteDao();
    }
}
