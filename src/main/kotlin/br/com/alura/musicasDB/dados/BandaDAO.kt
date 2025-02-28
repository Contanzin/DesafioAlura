package br.com.alura.musicasDB.dados

import br.com.alura.musicasDB.modelos.Banda
import javax.persistence.EntityManager


class BandaDAO(manager: EntityManager):DAO<Banda,BandaEntity>(manager, BandaEntity::class.java) {

    override fun toEntity(objeto: Banda): BandaEntity {
        return BandaEntity(objeto.id, objeto.nome, objeto.descricao)
    }

    override fun toModel(entity: BandaEntity): Banda {
        return Banda(entity.nome, entity.descricao, entity.id)
    }
}