package com.aesc.worldskillsdemoapp1.repositorio

import androidx.lifecycle.LiveData
import com.aesc.worldskillsdemoapp1.api.MyRetrofitBuilder
import com.aesc.worldskillsdemoapp1.modelo.PokemonDetails
import com.aesc.worldskillsdemoapp1.modelo.Pokemons
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

object Respositorio {
    var job: CompletableJob? = null

    //Traendo pokemons con cantidades dinamicas
    fun getPokemons(limit: String): LiveData<Pokemons> {
        job = Job()
        return object : LiveData<Pokemons>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val pokemons = MyRetrofitBuilder.apiService.getPokemons(limit)
                        withContext(Main) {
                            value = pokemons
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    //Traendo pokemosn por defecto
    fun getPokemons(): LiveData<Pokemons> {
        job = Job()
        return object : LiveData<Pokemons>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val pokemons = MyRetrofitBuilder.apiService.getPokemons()
                        withContext(Main) {
                            value = pokemons
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    //Obtener Detalle
    fun getPokemonDetails(idAnime: String): LiveData<PokemonDetails> {
        job = Job()
        return object : LiveData<PokemonDetails>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val pokemonsDetails = MyRetrofitBuilder.apiService.getStatusPokemon(idAnime)
                        withContext(Main) {
                            value = pokemonsDetails
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJob() {
        job?.cancel()
    }


}