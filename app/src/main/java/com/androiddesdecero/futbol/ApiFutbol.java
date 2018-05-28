package com.androiddesdecero.futbol;

import com.androiddesdecero.futbol.model.Encuentro;
import com.androiddesdecero.futbol.model.Partido;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by albertopalomarrobledo on 28/5/18.
 */

public interface ApiFutbol {

    @GET("ncompeticiones/server.php?action=getEquipo&tmp=2017/2018&id=0201045201&cmp=48")
    Call<Partido> getPartido();

}
