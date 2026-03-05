package com.mycompany.support.handler;

import com.mycompany.support.model.Request;
import com.mycompany.support.model.Priority;

public class Level3SupportHandler extends SupportHandler{
	@Override
	public void handleRequest(Request request) {

        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Critical support handled the request");
        } else {
            handleNext(request);
        }
	}
}
