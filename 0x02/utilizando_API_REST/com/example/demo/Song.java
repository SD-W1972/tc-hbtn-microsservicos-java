package com.example.demo;

import java.util.Objects;

public class Song {


    private Integer id;
    private String nome;
    private String artista;
    private String album;
    private String anoLancamento;

    public Song(Integer id, String nome, String artista, String album, String anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(getId(), song.getId()) && Objects.equals(getNome(), song.getNome()) && Objects.equals(getArtista(), song.getArtista()) && Objects.equals(getAlbum(), song.getAlbum()) && Objects.equals(getAnoLancamento(), song.getAnoLancamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getArtista(), getAlbum(), getAnoLancamento());
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
