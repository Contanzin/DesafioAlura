package br.com.alura.musicasDB.dados

import br.com.alura.musicasDB.extension.toEntity
import br.com.alura.musicasDB.extension.toModel
import br.com.alura.musicasDB.modelos.Banda
import javax.persistence.EntityManager


class BandaDAO(manager: EntityManager):DAO<Banda,BandaEntity>(manager, BandaEntity::class.java) {

    override fun toEntity(model: Banda): BandaEntity {
        return model.toEntity()
    }
    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }
}