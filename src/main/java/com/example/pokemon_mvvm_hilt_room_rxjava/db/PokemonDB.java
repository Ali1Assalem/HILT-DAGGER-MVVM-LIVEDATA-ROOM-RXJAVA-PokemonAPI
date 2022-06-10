package com.example.pokemon_mvvm_hilt_room_rxjava.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pokemon_mvvm_hilt_room_rxjava.model.Pokemon;

@Database(entities = Pokemon.class, version = 1, exportSchema = false)
public abstract class PokemonDB extends RoomDatabase {
    public abstract PokemonDao pokemonDao();
}
