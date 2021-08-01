package com.aesc.worldskillsdemoapp1.api

import com.aesc.worldskillsdemoapp1.modelo.PokemonDetails
import com.aesc.worldskillsdemoapp1.modelo.Pokemons
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    //Pasandole variables
    @GET("pokemon?q")
    suspend fun getPokemons(
        @Query("limit") limit: String
    ): Pokemons

    //obteniendo los primeros 20 pokemons
    @GET("pokemon")
    suspend fun getPokemons(): Pokemons

    //pokemon/18/
    @GET("pokemon/{animeId}/")
    suspend fun getStatusPokemon(@Path("animeId") animeId: String): PokemonDetails

}