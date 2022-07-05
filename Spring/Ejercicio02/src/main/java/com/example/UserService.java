package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    NotificacionService notificacion;

    public UserService(NotificacionService notificacion) {
        this.notificacion = notificacion;
    }
}
