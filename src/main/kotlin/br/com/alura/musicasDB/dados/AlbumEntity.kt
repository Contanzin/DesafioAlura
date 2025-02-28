package br.com.alura.musicasDB.dados

import javax.persistence.*

@Entity
@Table(name = "Album")
class AlbumEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String = 0,
    var titulo: String = "Titulo do Album",
    @OneToMany
    var banda: String




) {

}