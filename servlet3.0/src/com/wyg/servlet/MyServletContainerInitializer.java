package com.wyg.servlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

//在容器启动时会将HandlesTypes指定的这个感兴趣类型的子类，子接口，实现类传递过来
@HandlesTypes(value = {HelloService.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    /**
     *
     * @param set---->感兴趣类型的所有子类，子接口，实现类的集合
     * @param servletContext--->代表当前web应用的ServletContext，一个web应用一个ServletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型");
        for (Class<?> aClass : set) {
            System.out.println(aClass);
        }
    }
}
