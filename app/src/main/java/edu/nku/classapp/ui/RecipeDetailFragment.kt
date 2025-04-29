package edu.nku.classapp.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import edu.nku.classapp.R
import edu.nku.classapp.databinding.FragmentRecipeDetailBinding
import edu.nku.classapp.viewmodel.RecipeDetailViewModel
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RecipeDetailFragment : Fragment() {
    private var _binding: FragmentRecipeDetailBinding? = null
    private val binding get() = _binding!!

    private val recipeDetailViewModel: RecipeDetailViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipeDetailBinding.inflate(inflater, container, false)
        recipeDetailViewModel.fillData(arguments?.getString(BUNDLE_ID) ?: "")
        setUpObservers()
        return binding.root
    }

    private fun setUpObservers() {
        lifecycleScope.launch {
            recipeDetailViewModel.state.collect { event ->
                when (event) {
                    RecipeDetailViewModel.RecipeState.Failure -> {
                    }

                    RecipeDetailViewModel.RecipeState.Loading -> {

                    }

                    is RecipeDetailViewModel.RecipeState.Success -> {
                        binding.recipeNameDetail.text =
                            binding.root.context.getString(R.string.recipe_name, event.recipe.title)
                    }
                }
            }
        }
    }

    companion object {
        private const val BUNDLE_ID = "title"

        fun newInstance(title: String) = RecipeDetailFragment().apply {
            arguments = bundleOf(BUNDLE_ID to title)
            Log.d("Recipe title", title)
        }
    }
}