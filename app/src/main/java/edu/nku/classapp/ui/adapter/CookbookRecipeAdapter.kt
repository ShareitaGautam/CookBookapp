package edu.nku.classapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.nku.classapp.databinding.RecipeCardViewBinding
import edu.nku.classapp.model.Recipe

class CookbookAdapter(
    private val onRecipeClicked: (recipe: Recipe, position: Int) -> Unit
) : RecyclerView.Adapter<CookbookAdapter.CookbookViewHolder>() {

    private val recipeList = mutableListOf<Recipe>()

    inner class CookbookViewHolder(
        private val binding: RecipeCardViewBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onRecipeClicked(recipeList[position], position)
                }
            }
        }

        fun bind(recipe: Recipe) {
            binding.recipeName.text = recipe.name
            binding.recipeTime.text = "View Details"
        }
    }

    fun refreshData(newRecipes: List<Recipe>) {
        recipeList.clear()
        recipeList.addAll(newRecipes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CookbookViewHolder {
        val binding = RecipeCardViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CookbookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CookbookViewHolder, position: Int) {
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int = recipeList.size
}
