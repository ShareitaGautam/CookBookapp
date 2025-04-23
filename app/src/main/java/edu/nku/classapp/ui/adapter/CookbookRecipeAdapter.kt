package edu.nku.classapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import edu.nku.classapp.R
import edu.nku.classapp.databinding.RecipeCardViewBinding
import edu.nku.classapp.model.Recipe


class CookbookRecipeAdapter(
    private val onRecipeClicked: (recipe: Recipe, position: Int) -> Unit
) : RecyclerView.Adapter<CookbookRecipeAdapter.CookbookViewHolder>() {

    private val recipeList = mutableListOf<Recipe>()

    inner class CookbookViewHolder(
        private val binding: RecipeCardViewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onRecipeClicked(recipeList[position], position)
                }
            }
        }

        fun bind(recipe: Recipe) {
            binding.recipeName.text = "Name: ${recipe.name}"
            binding.recipeTime.text = "Time: ${recipe.time}"
            binding.recipeIngredients.text = "Ingredients: ${recipe.ingredients}"

            Glide.with(binding.root).load(R.drawable.ic_launcher_background)
                .into(binding.recipeImage)

            Glide.with(binding.root)
                .load(
                    if (recipe.isFavorite) R.drawable.baseline_favorite_24
                    else R.drawable.baseline_favorite_border_24
                )
                .into(binding.favoriteButton)


            binding.favoriteButton.setOnClickListener {
                recipe.isFavorite = !recipe.isFavorite
                notifyItemChanged(adapterPosition)
            }


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
