package br.com.alura.musicasDB.main

import br.com.alura.musicasDB.dados.AlbumDAO
import br.com.alura.musicasDB.dados.Banco
import br.com.alura.musicasDB.dados.BandaDAO
import br.com.alura.musicasDB.modelos.Album
import br.com.alura.musicasDB.modelos.Banda


fun main() {

    val manager =Banco.getEntityManager()
    val albumDAO = AlbumDAO(manager)
    val bandaDAO = BandaDAO(manager)

    //val banda = Banda("Aerosmith", "Uma banda daora")
    //bandaDAO.adicionar(banda)
    val aerosmith = bandaDAO.recuperarPeloId(1)
    val jpp = Album("Just Push Play", aerosmith)
    val  vacation= Album("PermanentVacation", aerosmith)


    println(aerosmith)
    albumDAO.adicionar(vacation)
    albumDAO.adicionar(jpp)


    val raul = albumDAO.recuperarPeloId(1)

    println(raul)

    val listaAlbuns = albumDAO.getLista()
    println(listaAlbuns)

    manager.close()

}