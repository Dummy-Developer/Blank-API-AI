package com.example.chungwei.placetogo.services;

import android.content.Context;

import ai.api.AIListener;
import ai.api.AIServiceException;
import ai.api.android.AIConfiguration;
import ai.api.android.AIService;

public class APIAIService {

    private AIService aiService;

    public APIAIService(Context context, AIListener listener) {
        final AIConfiguration config = new AIConfiguration("REPLACE_CLIENT_ACCESS_TOKEN",
                AIConfiguration.SupportedLanguages.English,
                AIConfiguration.RecognitionEngine.System);

        aiService = AIService.getService(context, config);
        aiService.setListener(listener);
    }

    // Voice Input
    public void startListening() {
        aiService.startListening();
    }

    public void stopListening() {
        aiService.stopListening();
    }

    public void cancel() {
        aiService.cancel();
    }

    // Text input
    public void textRequest(String textRequest) throws AIServiceException {
        aiService.textRequest(textRequest, null);
    }
}
