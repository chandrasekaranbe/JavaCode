package com.Test1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main (String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.Test1.Fruits");

        Object obj = new Fruits();

        Method[] methods= c.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println(c.getName());
        System.out.println(c.getFields().length);

        Method govaMethod = c.getMethod("getGova",
                String.class);
        System.out.println(govaMethod.getName() +","+ govaMethod.getTypeParameters().toString());
        govaMethod.invoke(obj,"Chandra");
    }
}
