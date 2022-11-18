/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JuanFernandez
 */
public class Cliente {
    private String nombre;
    private String celular;
    private String cedula;
    private int peso;

    public Cliente(String nombre, String celular, String cedula, int peso) {
        this.nombre = nombre;
        this.celular = celular;
        this.cedula = cedula;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", celular=" + celular + ", cedula=" + cedula + ", peso=" + peso + '}';
    }

    

    public int getCodigo() {
        int codigo = 0;
        return codigo;
    }
    
}
