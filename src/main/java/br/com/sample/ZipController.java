package br.com.sample;

import foundation.stack.datamill.http.Response;
import foundation.stack.datamill.http.ServerRequest;
import foundation.stack.datamill.http.annotations.GET;
import foundation.stack.datamill.http.annotations.Path;
import rx.Observable;


@Path("/api/100/zip")
public class ZipController {

    @GET
    @Path("/search")
    public Observable<Response> getUser(ServerRequest request) {
        return Observable.empty();
    }
}
