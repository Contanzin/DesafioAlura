package br.com.alura.musicasDB.dados

import javax.annotation.processing.Generated
import javax.persistence.*

@Entity
@Table(name = "banda")
class BandaEntity(
    var nome: String = "Nome da Banda",
    var descricao: String = "Descricao",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
)