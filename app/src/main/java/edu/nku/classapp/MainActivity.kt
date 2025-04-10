package edu.nku.classapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import edu.nku.classapp.databinding.ActivityMainBinding
import edu.nku.classapp.ui.CookbookRecipeListFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, CookbookRecipeListFragment())
            .setReorderingAllowed(true)
            .commit()


        //val db = FirebaseFirestore.getInstance()
        //Sample code on how to write to the firestore cloud database
        /*
        val user = hashMapOf(
            "first" to "Nathan",
            "last" to "Deininger",
            "born" to 2001
        )

        db.collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("Firestore", "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("Firestore", "Error adding document", e)
            }


        //Sample code on how to read to the firestore cloud database
        val usersCollection = db.collection("users")
        usersCollection.get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    // For each document in the result, log the data
                    Log.d("Firestore", "Document data: ${document.data}")
                }
            }
            .addOnFailureListener { e ->
                // If there's an error, log it
                Log.w("Firestore", "Error getting documents.", e)
            }


         */
    }
}