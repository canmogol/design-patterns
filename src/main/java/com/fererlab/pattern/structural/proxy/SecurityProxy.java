package com.fererlab.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object object;

    private SecurityProxy(Object o) {
        this.object = o;
    }

    public static Object newInstance(Object o) {
        return java.lang.reflect.Proxy.newProxyInstance(
                o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new SecurityProxy(o)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("posts are currently not allowed");
            } else {
                result = method.invoke(object, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("invocation exception, e: " + e.getMessage());
        }
        return result;
    }

}
