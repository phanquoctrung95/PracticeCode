package com.concurrent.in.practice;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface Computable<A, V> {
    V compute(A arg) throws InterruptedException, TimeoutException, ExecutionException;
}