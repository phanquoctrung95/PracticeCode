package com.concurrent.in.practice.shutdow.support;

import org.omg.CORBA.Request;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

class LifecycleWebServer {
    private final ExecutorService exec = Executors.newFixedThreadPool(20);
    public void start() throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (!exec.isShutdown()) {
            try {
                final Socket conn = socket.accept();
                exec.execute(new Runnable() {
                    public void run() { handleRequest(conn); }
                });
            } catch (RejectedExecutionException e) {
                if (!exec.isShutdown())
                    log("task submission rejected", e);
            }
        }
    }
    private void log(String msg, Throwable e){};
    public void stop() { exec.shutdown(); }
    void handleRequest(Socket connection) {
        Request req = readRequest(connection);
        if (isShutdownRequest(req))
            stop();
        else
            dispatchRequest(req);
    }

    private boolean isShutdownRequest(Request req) {
    }

    private void dispatchRequest(Request req) {
    }

    private Request readRequest(Socket connection) {
    }
}