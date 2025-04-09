package edu.nku.classapp.data

import edu.nku.classapp.model.FoodResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FoodApi {
    @GET("/api/v2/product/{barcode}")
    suspend fun getProduct(@Path("barcode") barcode: Int): Response<FoodResponse>
}