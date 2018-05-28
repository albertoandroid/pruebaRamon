package com.androiddesdecero.futbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androiddesdecero.futbol.model.Encuentro;
import com.androiddesdecero.futbol.model.Partido;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String URLAPI = "http://www.ffcv.es/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URLAPI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiFutbol apiFutbol = retrofit.create(ApiFutbol.class);
        Call<Partido> call = apiFutbol.getPartido();
        call.enqueue(new Callback<Partido>() {
            @Override
            public void onResponse(Call<Partido> call, Response<Partido> response) {
                Log.d("holaaaaa", response.body().toString());
                Log.d("HOLA2", response.body().getEncuentros().get(0).getCodCompeticion());
                Log.d("HOLA2", response.body().getEncuentros().get(0).getJornadas().get(0).getIdClubLocal());
                Log.d("HOLA2", response.body().getEncuentros().get(0).getJornadas().get(0).getNomLocal());
            }

            @Override
            public void onFailure(Call<Partido> call, Throwable t) {
                Log.e("fallo",t.toString());
            }
        });
    }
}
