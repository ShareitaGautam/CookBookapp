package edu.nku.classapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import edu.nku.classapp.databinding.FragmentRecipeListBinding
import edu.nku.classapp.model.Recipe
import edu.nku.classapp.ui.adapter.CookbookRecipeAdapter

class CookbookRecipeListFragment : Fragment() {

    private var _binding: FragmentRecipeListBinding? = null
    private val binding get() = _binding!!

    private val cookbookAdapter = CookbookRecipeAdapter { recipe: Recipe, position ->


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = cookbookAdapter
        }

        val sampleRecipes = listOf(
            Recipe(
                "idplaceholder1",
                "Fried Rice",
                "Rice, Vegetables",
                "1. Cook rice\n2. Stir-fry\n3. Mix",
                time = "15 min"
            ),
            Recipe(
                "idplaceholder2",
                "Toast",
                "Bread, Butter",
                "1. Toast\n2. Butter",
                time = "5 min"
            )
        )

        var showFavoritesOnly = false
        binding.searchBar.setOnQueryTextListener(object :
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = false

            override fun onQueryTextChange(newText: String?): Boolean {
                val filtered = if (showFavoritesOnly) {
                    sampleRecipes.filter {
                        it.isFavorite && (it.name.contains(
                            newText.orEmpty(),
                            ignoreCase = true
                        ) || it.ingredients.contains(newText.orEmpty(), ignoreCase = true))
                    }
                } else {
                    sampleRecipes.filter {
                        it.name.contains(
                            newText.orEmpty(),
                            ignoreCase = true
                        ) || it.ingredients.contains(newText.orEmpty(), ignoreCase = true)
                    }
                }
                cookbookAdapter.refreshData(filtered)
                return true
            }
        })


        binding.favoritesFilterButton.setOnClickListener {
            showFavoritesOnly = !showFavoritesOnly
            binding.favoritesFilterButton.text =
                if (showFavoritesOnly) "Show All" else "Show Favorites"

            val filtered = if (showFavoritesOnly) {
                sampleRecipes.filter { it.isFavorite }
            } else {
                sampleRecipes
            }

            cookbookAdapter.refreshData(filtered)
        }



        cookbookAdapter.refreshData(sampleRecipes)

        binding.recyclerView.isVisible = true
        binding.progressBar.isVisible = false
        binding.errorMessage.isVisible = false
    }

}
