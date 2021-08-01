package com.aesc.worldskillsdemoapp1.modelo


data class Result(
    var name: String? = null,
    var url: String? = null
)

data class Pokemons(
    var count: Int? = 0,
    var next: String? = null,
    var previous: Any? = null,
    var results: List<Result>? = null
)