package edu.nku.classapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = FirebaseFirestore.getInstance()


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
        */

        //Sample code on how to write to the firestore cloud database
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
    }
}