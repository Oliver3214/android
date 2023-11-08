package com.example.app_proyecto

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private lateinit var edtCodigo: EditText
    private lateinit var tvNombre: TextView
    private lateinit var tvDescripcion: TextView
    private lateinit var tvPrecio: TextView
    private lateinit var imgProducto: ImageView
    private lateinit var btnBuscar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtCodigo = findViewById(R.id.edtCodigo)
        tvNombre = findViewById(R.id.tvNombre)
        tvDescripcion = findViewById(R.id.tvDescripcion)
        tvPrecio = findViewById(R.id.tvPrecio)
        imgProducto = findViewById(R.id.imgProducto)
        btnBuscar = findViewById(R.id.btnBuscar)

        btnBuscar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Call the find function with the entered code
                val codigo = edtCodigo.text.toString()
                find(codigo)
            }
        })
    }

    private fun find(codigo: String) {
        // Retrofit initialization
        val retrofit = Retrofit.Builder()
            .baseUrl("Your_Base_URL_Here") // Replace with your actual base URL
            .build()

        // Add the necessary code for making network requests using Retrofit
        // ...
    }
}
