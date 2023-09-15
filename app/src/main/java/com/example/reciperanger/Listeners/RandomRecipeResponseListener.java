package com.example.reciperanger.Listeners;

import com.example.reciperanger.Model.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response,String message);
    void didError(String message);
}
