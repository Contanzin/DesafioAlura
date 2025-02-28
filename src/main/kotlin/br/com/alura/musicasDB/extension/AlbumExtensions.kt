package br.com.alura.musicasDB.extension

import br.com.alura.musicasDB.dados.AlbumEntity
import br.com.alura.musicasDB.modelos.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.titulo, this.banda.toEntity(),this.id)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.titulo, this.banda.toModel(), this.id)
}