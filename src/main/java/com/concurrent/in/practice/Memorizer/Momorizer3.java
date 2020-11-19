package com.concurrent.in.practice.Memorizer;

import com.concurrent.in.practice.Computable;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.*;

public class Momorizer3<A, V> implements Computable<A, V> {
    private Map<A, FutureTask<V>> cache = new ConcurrentHashMap<>();
    private Computable c;
    private final int TIME_OUT = 200;

    @Override
    public V compute(A arg) throws InterruptedException, TimeoutException, ExecutionException {
        FutureTask<V> f = cache.get(arg);
        if (Objects.isNull(f)) {
            Callable callable = new Callable() {
                @Override
                public Object call() throws Exception {
                    return c.compute(arg);
                }
            };
            FutureTask<V> ft = new FutureTask<>(callable);
            f = ft;
            cache.putIfAbsent(arg, f);
            f.run();
        }
        try {
            return f.get(TIME_OUT, TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException e) {
            System.out.println("Error when get from FutureTask " + e);
            throw e;
        }
    }
}
