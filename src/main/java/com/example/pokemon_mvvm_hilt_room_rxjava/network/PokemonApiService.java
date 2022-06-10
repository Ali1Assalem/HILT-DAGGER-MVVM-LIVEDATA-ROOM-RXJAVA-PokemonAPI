package com.example.pokemon_mvvm_hilt_room_rxjava.network;

import com.example.pokemon_mvvm_hilt_room_rxjava.model.PokemonResponse;


import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface PokemonApiService {

    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();
}
