package br.com.fiap.juros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class JurosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juros)

        val juros = JurosSimples()
        val jurosRetornado = juros.calcularJurosSimples(2000.0, 15.0, 2.0)

        Toast.makeText(this, "Retorno de juros: $jurosRetornado", Toast.LENGTH_SHORT).show()
    }
}