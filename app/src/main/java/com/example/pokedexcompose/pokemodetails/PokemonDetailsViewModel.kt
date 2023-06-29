package com.example.pokedexcompose.pokemodetails

import androidx.lifecycle.ViewModel
import com.example.pokedexcompose.Resource
import com.example.pokedexcompose.data.remote.responses.Pokemon
import com.example.pokedexcompose.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}