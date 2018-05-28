package com.androiddesdecero.futbol.model;

import java.util.List;

/**
 * Created by albertopalomarrobledo on 28/5/18.
 */

public class Partido {

    private List<Encuentro> encuentros;

    public List<Encuentro> getEncuentros() {
        return encuentros;
    }

    public void setEncuentros(List<Encuentro> encuentros) {
        this.encuentros = encuentros;
    }
}
