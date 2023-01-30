package com.example.festimusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.festimusic.database.Entity.QuoteEntity;
import com.example.festimusic.database.dao.QuoteDao;
import com.example.festimusic.databinding.ActivityLoginBinding;
import com.example.festimusic.model.Quote;
import com.example.festimusic.recycler.CharacterAdapter;
import com.example.festimusic.recycler.CharacterProvider;
import com.example.festimusic.repository.QuoteRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class Login extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Inject
    QuoteRepository quoteRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        QuoteEntity bill = new QuoteEntity("as", "gates");
         quoteRepository.Insert(bill);
//        Toast.makeText(this, Integer.toString(user.getAge()), Toast.LENGTH_LONG).show();
//        initRecycler();


    }

    protected void initRecycler() {
        RecyclerView recyclerViewer = findViewById(R.id.recyclerCharacter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerViewer.setLayoutManager(manager);
        CharacterProvider characterProvider = new CharacterProvider();
        recyclerViewer.setAdapter(new CharacterAdapter(characterProvider.getCharacters()));

    }
}