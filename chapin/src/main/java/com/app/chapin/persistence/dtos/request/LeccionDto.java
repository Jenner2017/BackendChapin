package com.app.chapin.persistence.dtos.request;

import lombok.Data;

@Data
public class LeccionDto {
    private String  tipoLeccion;
    private String titulo;
    private ContenidoDTO contenido;
    private String nivel;
    private Integer orden;
    private Integer duracionEstimada;
    private boolean activo;
}
