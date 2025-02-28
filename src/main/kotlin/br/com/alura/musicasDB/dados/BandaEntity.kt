package br.com.alura.musicasDB.dados

import javax.annotation.processing.Generated
import javax.persistence.*

@Entity
@Table(name = "Banda")
class BandaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    var nome: String = "Nome da Banda",
    var descricao: String = "Descricao"
) {


}