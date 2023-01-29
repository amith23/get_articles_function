package com.example.article_get;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CloudFunctionApplication implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        return "Hello " + input + ", and welcome to Spring Cloud Function!!!";
    }
}