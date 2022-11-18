/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanFernandez
 */
public class Articulo {
    private String tema;
    private String autor;
    private int numpagina;

    public Articulo(String tema, String autor, int numpagina) {
        this.tema = tema;
        this.autor = autor;
        this.numpagina = numpagina;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpagina() {
        return numpagina;
    }

    public void setNumpagina(int numpagina) {
        this.numpagina = numpagina;
    }

    @Override
    public String toString() {
        return "Articulo{" + "tema=" + tema + ", autor=" + autor + ", numpagina=" + numpagina + '}';
    }

    public int getCodigo(int codigo) {
        return codigo;
    }

    public int setCodigo(int codigo){
        return codigo;
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


