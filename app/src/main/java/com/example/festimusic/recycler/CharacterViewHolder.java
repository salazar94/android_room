package com.example.festimusic.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.festimusic.CharacterData;
import com.example.festimusic.R;
import com.example.festimusic.databinding.ItemCharacterBinding;

import org.w3c.dom.Text;

public class CharacterViewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView characterId;
    TextView characterName;
    TextView characterSpecie;
    CharacterViewHolder(View view){
        super(view);
        characterId = view.findViewById(R.id.character_id);
        characterName = view.findViewById(R.id.character_name);
        characterSpecie = view.findViewById(R.id.character_species);
        img = view.findViewById(R.id.image_character);
    }
    public void render(CharacterData characterData){
        characterName.setText(characterData.getName());
        characterId.setText(Integer.toString(characterData.getId()));
        characterSpecie.setText(characterData.getSpecies());
        Glide.with(img.getContext()).load(characterData.getImage()).into(img);
    }
}
