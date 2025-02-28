package br.com.alura.musicasDB.main

import br.com.alura.musicasDB.modelos.Album
import br.com.alura.musicasDB.modelos.Banda


fun main() {


    val titas = Banda("Titãs")
    val goBack = Album("Go Back", titas)
    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)

    println(titas)
    println(goBack)
    println(cabecaDinossauro)

}