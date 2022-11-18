/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Factura {
    private String nombreEmpresa;
    private int codeTransicion;
    private String lugar;

    public Factura(String nombreEmpresa, int codeTransicion, String lugar) {
        this.nombreEmpresa = nombreEmpresa;
        this.codeTransicion = codeTransicion;
        this.lugar = lugar;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCodeTransicion() {
        return codeTransicion;
    }

    public void setCodeTransicion(int codeTransicion) {
        this.codeTransicion = codeTransicion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Factura{" + "nombreEmpresa=" + nombreEmpresa +
                ", codeTransicion=" + codeTransicion + ", lugar=" + lugar + '}';
    }

    public int getCodigo(int codigo) {
        return codigo;
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
