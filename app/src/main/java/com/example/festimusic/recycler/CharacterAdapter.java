package com.example.festimusic.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.festimusic.CharacterData;
import com.example.festimusic.R;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {
    private List<CharacterData> characterDataList;

    public CharacterAdapter(List <CharacterData> characterDataList) {
        this.characterDataList = characterDataList;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View layout = layoutInflater.inflate(R.layout.item_character,parent,false);
        return new CharacterViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        CharacterData characterData = characterDataList.get(position);
        holder.render(characterData);
    }

    @Override
    public int getItemCount() {
        return characterDataList.size();
    }
}
