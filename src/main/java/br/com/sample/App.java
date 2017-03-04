package br.com.sample;

import foundation.stack.datamill.http.Method;
import foundation.stack.datamill.http.ResponseBuilder;
import foundation.stack.datamill.http.Server;
import foundation.stack.datamill.reflection.OutlineBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OutlineBuilder outlineBuilder = new OutlineBuilder();

        Server server = new Server(
                rb -> rb.ifMethodAndUriMatch(Method.GET, "/status", r -> r.respond(ResponseBuilder::ok))
                        .elseIfMatchesBeanMethod(outlineBuilder.wrap(new ZipController()))
                        .orElse(r -> r.respond(ResponseBuilder::notFound)));

        server.listen(7050);

        //localhost:7050/api/100/zip/search?code=73252200
    }
}
