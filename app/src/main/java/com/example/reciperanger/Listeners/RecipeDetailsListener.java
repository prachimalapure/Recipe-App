package com.example.reciperanger.Listeners;

import com.example.reciperanger.Model.RecipeDetailsResponse;

public interface RecipeDetailsListener {

    void didFetch(RecipeDetailsResponse response , String message);
    void didError(String message);
}
