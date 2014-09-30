package io.glassjournalism.glassgenius;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

public interface WebServiceAPI {

    @POST("/create")
    void postSpeechSnippet(@Body SpeechSnippet speechSnippet, Callback<Response> cb);
}
