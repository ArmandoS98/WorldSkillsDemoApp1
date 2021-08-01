package com.aesc.worldskillsdemoapp1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.aesc.worldskillsdemoapp1.R
import com.aesc.worldskillsdemoapp1.modelo.Result
import kotlinx.android.synthetic.main.item_pokemon_card.view.*

class AdapterPokemons : RecyclerView.Adapter<AdapterPokemons.ViewHolder>() {
    private var pokemonList: List<Result> = listOf()

    fun setPokemons(pokemonList: List<Result>) {
        this.pokemonList = pokemonList
        notifyDataSetChanged()
    }

    private fun ViewGroup.inflate(
        @LayoutRes layoutRes: Int,
        attachRoot: Boolean = false
    ): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachRoot)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.item_pokemon_card, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_name.text = pokemonList[position].name
        holder.itemView.tv_url.text = pokemonList[position].url
    }

    override fun getItemCount() = pokemonList.size

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val item: Result = pokemonList[adapterPosition]
            println("DEBUG -> ${item.name}")
        }

    }
}


