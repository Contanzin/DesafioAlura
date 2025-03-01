package br.com.alura.musicasDB.dados

import br.com.alura.musicasDB.extension.toEntity
import br.com.alura.musicasDB.extension.toModel
import br.com.alura.musicasDB.modelos.Album
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager):DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java ) {

    override fun toEntity(model: Album): AlbumEntity {
        return model.toEntity()
    }
    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }
}