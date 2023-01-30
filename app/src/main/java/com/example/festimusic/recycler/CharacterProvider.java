package com.example.festimusic.recycler;

import com.example.festimusic.CharacterData;
import com.example.festimusic.UserData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterProvider {
    private List<CharacterData> characters = new ArrayList<>();

    public CharacterProvider(){
        List<Map<String, Object>> data = Arrays.asList(
                new HashMap<String, Object>() {{
                    put("id", 1);
                    put("name", "Rick Sanchez");
                    put("species", "Human");
                    put("image", "https://rickandmortyapi.com/api/character/avatar/1.jpeg");
                }},
                new HashMap<String, Object>() {{
                    put("id", 2);
                    put("name", "Morty Smith");
                    put("species", "Human");
                    put("image", "https://rickandmortyapi.com/api/character/avatar/2.jpeg");
                }},
                new HashMap<String, Object>() {{
                    put("id", 3);
                    put("name", "Summer Smith");
                    put("species", "Human");
                    put("image", "https://rickandmortyapi.com/api/character/avatar/3.jpeg");
                }},
                new HashMap<String, Object>() {{
                    put("id", 4);
                    put("name", "Beth Smith");
                    put("species", "Human");
                    put("image", "https://rickandmortyapi.com/api/character/avatar/4.jpeg");
                }},
                new HashMap<String, Object>() {{
                    put("id", 5);
                    put("name", "Jerry Smith");
                    put("species", "Human");
                    put("image", "https://rickandmortyapi.com/api/character/avatar/5.jpeg");
                }}
        );
        for (Map<String, Object> item : data) {
            CharacterData character = new CharacterData((int) item.get("id"), (String) item.get("name"), (String) item.get("species"), (String) item.get("image"));
            characters.add(character);
        }
        characters.add(new CharacterData(6, "Abadango Cluster Princess", "Alien", "https://rickandmortyapi.com/api/character/avatar/6.jpeg"));
        characters.add(new CharacterData(7, "Abradolf Lincler", "Human", "https://rickandmortyapi.com/api/character/avatar/7.jpeg"));
        characters.add(new CharacterData(8, "Adjudicator Rick", "Human", "https://rickandmortyapi.com/api/character/avatar/8.jpeg"));
        characters.add(new CharacterData(9, "Agency Director", "Human", "https://rickandmortyapi.com/api/character/avatar/9.jpeg"));
        characters.add(new CharacterData(10, "Alan Rails", "Human", "https://rickandmortyapi.com/api/character/avatar/10.jpeg"));
    }

    public List<CharacterData> getCharacters() {
        return characters;
    }
}
