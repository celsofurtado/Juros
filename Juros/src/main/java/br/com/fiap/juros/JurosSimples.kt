package br.com.fiap.juros

class JurosSimples {

    // J = C.I.T
    fun calcularJurosSimples(capital: Double, taxa: Double, tempo: Double): Double {
        return capital * (taxa / 100) * tempo
    }

}