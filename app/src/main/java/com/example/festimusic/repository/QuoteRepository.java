package com.example.festimusic.repository;

import com.example.festimusic.database.Entity.QuoteEntity;
import com.example.festimusic.database.dao.QuoteDao;
import com.example.festimusic.model.Quote;

import javax.inject.Inject;


public class QuoteRepository {
    private QuoteDao quoteDao;

    @Inject
    public QuoteRepository(QuoteDao quoteDao) {
        this.quoteDao = quoteDao;
    }

    public  void Insert(QuoteEntity quote){
        this.quoteDao.insert(quote);
    }
}
