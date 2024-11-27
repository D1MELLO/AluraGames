package com.alura.dimello

data class Jogo (val titulo: String, val capa: String) {

    val descricao = ""

    override fun toString(): String {
        return "Meu Jogo:\n" +
                "TÍtulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descrição: $descricao"
    }

}