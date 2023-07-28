package com.example.bookshelf.network

import com.example.bookshelf.BookShelf
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResultsa: Int
    ):  BookShelf
}