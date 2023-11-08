package com.example.app_proyecto.interfaces;

import com.example.app_proyecto.models.Producto;


import retrofit2.http.GET;

public interface ProductoAPI {
    @GET("api/producto/{id}")
    public call<Producto> find(@path ("id") String id);

}
