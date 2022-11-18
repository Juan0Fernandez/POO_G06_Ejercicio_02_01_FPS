/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author USUARIO
 */
public class Grupo {

    private String nombreEdificio;
        private String grupo;
    private int numeroEstudiantes;

    public Grupo(String nombreEdificio, String grupo, int numeroEstudiantes) {
        this.nombreEdificio = nombreEdificio;
        this.grupo = grupo;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombreEdificio=" + nombreEdificio + ", grupo="
                + grupo + ", numeroEstudiantes=" + numeroEstudiantes + '}';
    }

    public int getCodigo(int codigo) {
        return codigo;
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
