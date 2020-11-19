package com.concurrent.in.practice.Memorizer;

import com.concurrent.in.practice.Computable;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Factorize implements  Servlet {
    private final Computable<BigInteger, BigInteger[]> c = new Computable<BigInteger, BigInteger[]>() {
        @Override
        public BigInteger[] compute(BigInteger arg) throws InterruptedException {
            return factor(arg);
        }
    };
    private Computable<BigInteger, BigInteger[]> cache = new Memorizer<>(c);

    private BigInteger[] factor(BigInteger arg) {
        return null;
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = extractFromRequest(servletRequest);
        try {
            encodeIntoResonse(servletResponse, cache.compute(i));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    private BigInteger extractFromRequest(ServletRequest servletRequest) {
        return BigInteger.valueOf(0);
    }

    private void encodeIntoResonse(ServletResponse servletResponse, BigInteger[] compute) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
