package com.androiddesdecero.futbol.model;

import java.util.List;

/**
 * Created by albertopalomarrobledo on 28/5/18.
 */

public class Encuentro {
    private String codCompeticion;
    private String nomCompeticion;
    private List<Jornada> jornadas;

    public List<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public String getCodCompeticion() {
        return codCompeticion;
    }

    public void setCodCompeticion(String codCompeticion) {
        this.codCompeticion = codCompeticion;
    }

    public String getNomCompeticion() {
        return nomCompeticion;
    }

    public void setNomCompeticion(String nomCompeticion) {
        this.nomCompeticion = nomCompeticion;
    }
}
