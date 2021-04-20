package com.example.contabancaria

class Login {
    var usuario: String? = null
    var senha: String? = null

    fun ValidarUsuario(): Boolean {
        return if (usuario == "") {
            false
        } else if (senha == "") {
            false
        } else !(usuario != USUARIO || senha != SENHA)
    }

    companion object {
        private const val USUARIO = "admin"
        private const val SENHA = "123"
    }

}