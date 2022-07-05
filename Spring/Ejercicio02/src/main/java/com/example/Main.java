package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificacionService notificacion = (NotificacionService) context.getBean("notificacionService");

        notificacion.imprimirSaludo();

        UserService user = (UserService) context.getBean("userService");

        user.notificacion.imprimirSaludo();
        
    }

}
