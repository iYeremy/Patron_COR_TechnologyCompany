package com.mycompany.support.handler;

import com.mycompany.support.model.Request;
import com.mycompany.support.model.Priority;

public class Level2SupportHandler extends SupportHandler{
	@Override
	public void handleRequest(Request request) {

        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Intermediate support handled the request");
        } else {
            handleNext(request);
        }
	}
}
