/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import Modelo.Profesor;
import java.time.LocalDate;

import servicio.ServicioProfesorImpl;
/**
 *
 * @author JuanFernandez
 */
public class ProfesorControl {
    
     public ServicioProfesorImpl profesorServiceImpl;

    public ProfesorControl() {
        this.profesorServiceImpl = new ServicioProfesorImpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear el profesor";
        var estatura=Integer.valueOf(data[0]);
        var peso=Double.valueOf(data[2]);
        
        if(peso<0 || estatura<0){
            retorno+=" Peso o estatura no son correctas";
        }else{
            var profesor = new Profesor(170,"luis","Ingeniero",LocalDate.of(2022, 10, 02),71.16);
            this.profesorServiceImpl.crear(profesor);
            retorno= "Profesor "+profesor.getNombre()+" creado correctamente";
        }
        return retorno;
    }
}
