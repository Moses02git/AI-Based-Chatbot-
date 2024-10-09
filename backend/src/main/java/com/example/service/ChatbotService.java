package com.example.service;

import org.springframework.stereotype.Service;
import com.google.cloud.dialogflow.v2.*;

@Service
public class ChatbotService {
    public String getResponse(String question) {
        // Dialogflow integration logic
        // You need to set up Dialogflow API credentials here.
        return "Response from Dialogflow for question: " + question;
    }
}
