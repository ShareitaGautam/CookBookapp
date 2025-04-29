package edu.nku.classapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.nku.classapp.model.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RecipeDetailViewModel : ViewModel() {
    private val _state = MutableStateFlow<RecipeState>(RecipeState.Loading)
    val state: StateFlow<RecipeState> = _state.asStateFlow()

    fun fillData(id: String) = viewModelScope.launch {
        val db = com.google.firebase.firestore.FirebaseFirestore.getInstance()
        val recipesCollection = db.collection("recipes")
        var originalRecipeList: List<Recipe> = emptyList()

        recipesCollection.get()
            .addOnSuccessListener { result ->
                val recipeList = mutableListOf<Recipe>()
                for (document in result) {
                    val recipe = document.toObject(Recipe::class.java)
                    recipeList.add(recipe)
                }

                originalRecipeList = recipeList
                originalRecipeList.filter { it.id.equals(id, ignoreCase = true) }
                _state.value = RecipeState.Success(originalRecipeList.first())

            }.addOnFailureListener {
                _state.value = RecipeState.Failure
            }
    }

    sealed class RecipeState {
        data class Success(val recipe: Recipe) : RecipeState()
        data object Failure : RecipeState()
        data object Loading : RecipeState()
    }
}