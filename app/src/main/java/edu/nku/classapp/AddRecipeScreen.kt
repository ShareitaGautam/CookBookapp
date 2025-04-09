package edu.nku.classapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddRecipeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_card_view)

        val recipeName = findViewById<EditText>(R.id.editTextRecipeName)
        val ingredients = findViewById<EditText>(R.id.editTextIngredients)
        val steps = findViewById<EditText>(R.id.editTextSteps)
        val saveButton = findViewById<Button>(R.id.buttonSaveRecipe)

        saveButton.setOnClickListener {
            val name = recipeName.text.toString()
            val ing = ingredients.text.toString()
            val step = steps.text.toString()

            if (name.isNotEmpty() && ing.isNotEmpty() && step.isNotEmpty()) {
                Toast.makeText(this, "Recipe saved!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
