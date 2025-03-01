package br.com.alura.musicasDB.dados

import javax.persistence.*

@Entity
@Table(name = "album")
class AlbumEntity(
    var titulo: String = "Titulo do Album",
    @ManyToOne
    var banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
)