package com.app.chapin.persistence.dtos.request;

import lombok.Data;

@Data
public class CatalogoDto {

    private String nombre;
    private String detalle;
    private Boolean activo;
}