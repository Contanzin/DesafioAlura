package br.com.alura.musicasDB.modelos

class Album(

    val titulo: String = "Título do álbum",
    val banda: Banda = Banda(),
    val id: String = 0
    ) {
        override fun toString(): String {
            return "$titulo ($id) - $banda"
        }
}