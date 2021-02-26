package com.cmaccusco.primerproyecto.servicio;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ServicioSaludo {
  
  public String saludar(String nombre) {
    return "Hofffla " + Optional.ofNullable(nombre).orElse("Hola Mundo");
  }      
}