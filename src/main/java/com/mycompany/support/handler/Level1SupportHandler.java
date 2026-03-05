package com.mycompany.support.handler;

import com.mycompany.support.model.Request;
import com.mycompany.support.model.Priority;

public class Level1SupportHandler extends SupportHandler{
	@Override
	public void handleRequest(Request request) {

        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Basic support handled the request");
        } else {
            handleNext(request);
        }
	}
}
