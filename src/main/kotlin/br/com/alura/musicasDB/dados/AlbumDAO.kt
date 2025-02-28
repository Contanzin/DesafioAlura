package br.com.alura.musicasDB.dados

import br.com.alura.musicasDB.modelos.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager):DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java ) {

    override fun toEntity(objeto: Album): AlbumEntity {
        return AlbumEntity(objeto.id, objeto.titulo, objeto.banda)
    }

    override fun toModel(entity: AlbumEntity): Album {
        return Album(entity.titulo, entity.banda, entity.id)
    }
}