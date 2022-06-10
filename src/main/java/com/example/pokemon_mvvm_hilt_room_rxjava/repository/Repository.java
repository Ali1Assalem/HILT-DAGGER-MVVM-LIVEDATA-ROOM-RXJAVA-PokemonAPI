package com.example.pokemon_mvvm_hilt_room_rxjava.repository;

import androidx.lifecycle.LiveData;


import com.example.pokemon_mvvm_hilt_room_rxjava.db.PokemonDao;
import com.example.pokemon_mvvm_hilt_room_rxjava.model.Pokemon;
import com.example.pokemon_mvvm_hilt_room_rxjava.model.PokemonResponse;
import com.example.pokemon_mvvm_hilt_room_rxjava.network.PokemonApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;


public class Repository {
    private PokemonApiService pokemonApiService;
    private PokemonDao pokemonDao;

    @Inject
    public Repository(PokemonApiService pokemonApiService, PokemonDao pokemonDao) {
        this.pokemonApiService = pokemonApiService;
        this.pokemonDao = pokemonDao;
    }

    public Observable<PokemonResponse> getPokemons(){
        return pokemonApiService.getPokemons();
    }

    public void insertPokemon(Pokemon pokemon){pokemonDao.insertPokemon(pokemon);}

    public void deletePokemon(String pokemonName){pokemonDao.deletePokemon(pokemonName);}

    public LiveData<List<Pokemon>> getFavPokemon(){
        return pokemonDao.getPokemons();
    }
}
