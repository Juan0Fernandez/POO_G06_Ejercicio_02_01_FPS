/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author JuanFernandez
 */
public class Profesor {
    
    private String nombre;
    private String titulo;
    private LocalDate fechaNacimiento;
    private int estatura;
    private double peso;

    public Profesor(int estatura, String nombre, String titulo, LocalDate fechaNacimiento, double peso) {
       
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
        this.peso = peso;
    }

   
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

   

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", titulo=" + titulo + ", fechaNacimiento=" + fechaNacimiento + ", estatura=" + estatura + ", peso=" + peso + '}';
    }

    private int codigo;

    public Profesor(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
  
    
   
   
}
