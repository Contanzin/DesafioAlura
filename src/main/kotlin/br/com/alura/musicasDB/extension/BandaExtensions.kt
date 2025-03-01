package br.com.alura.musicasDB.extension

import br.com.alura.musicasDB.dados.BandaEntity
import br.com.alura.musicasDB.modelos.Banda

fun Banda.toEntity(): BandaEntity {
    return BandaEntity(this.nome, this.descricao, this.id)
}

fun BandaEntity.toModel(): Banda {
    return Banda(this.nome, this.descricao, this.id)
}