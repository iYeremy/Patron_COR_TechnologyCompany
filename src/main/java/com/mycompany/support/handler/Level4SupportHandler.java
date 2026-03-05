package com.mycompany.support.handler;

import com.mycompany.support.model.Request;
import com.mycompany.support.model.Priority;

public class Level4SupportHandler extends SupportHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.URGENT) {
            System.out.println("Urgent support handled the request");
        } else {
            handleNext(request);
        }
    }
}
