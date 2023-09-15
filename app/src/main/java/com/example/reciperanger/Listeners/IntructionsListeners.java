package com.example.reciperanger.Listeners;

import com.example.reciperanger.Model.InstructionsResponse;

import java.util.List;

public interface IntructionsListeners {
void didFetch(List<InstructionsResponse> response, String message);
void didError(String message);
}
