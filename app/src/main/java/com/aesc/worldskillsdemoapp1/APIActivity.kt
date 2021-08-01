package com.aesc.worldskillsdemoapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.aesc.worldskillsdemoapp1.adapter.AdapterPokemons
import com.aesc.worldskillsdemoapp1.modelo.Result
import com.aesc.worldskillsdemoapp1.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_apiactivity.*

class APIActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var pokemonAdapter: AdapterPokemons

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apiactivity)


        getPokemonsView()

    }

    private fun getPokemonsView() {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.pokemonP.observe(this, {
            AdapterPokemons().setPokemons(it.results!!)
            recyclerInit(it.results!!)
        })

        viewModel.setLimit("6")
    }

    private fun recyclerInit(results: List<Result>) {
        pokemonAdapter = AdapterPokemons()
        pokemonAdapter.setPokemons(results)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = pokemonAdapter
    }
}