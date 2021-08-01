package com.aesc.worldskillsdemoapp1.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.aesc.worldskillsdemoapp1.modelo.PokemonDetails
import com.aesc.worldskillsdemoapp1.modelo.Pokemons
import com.aesc.worldskillsdemoapp1.repositorio.Respositorio

class MainViewModel : ViewModel() {
    private val _limit: MutableLiveData<String> = MutableLiveData()

    val pokemonP: LiveData<Pokemons> = Transformations.switchMap(_limit) { pokemon ->
        Respositorio.getPokemons(pokemon)
    }

    val pokemon: LiveData<Pokemons> = Transformations.switchMap(_limit) {
        Respositorio.getPokemons()
    }

    val pokemonStatus: LiveData<PokemonDetails> = Transformations.switchMap(_limit) { status ->
        Respositorio.getPokemonDetails(status)
    }


    fun setLimit(limit: String) {
        _limit.value = limit
    }

    fun cancelJob() {
        Respositorio.cancelJob()
    }
}