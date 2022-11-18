/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import Modelo.Profesor;
import java.time.LocalDate;
import java.time.Month;
import servicio.ServicioProfesorImpl;
/**
 *
 * @author USUARIO
 */
public class ProfesorControl {
    
     private final ServicioProfesorImpl profesorServiceImpl;

    public ProfesorControl() {
        this.profesorServiceImpl = new ServicioProfesorImpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear el profesor";
        var estatura=Integer.valueOf(data[0]).intValue();
        var nombre=Integer.valueOf(data[1]).intValue();
        var peso=Double.valueOf(data[2]).doubleValue();
        var titulo=Integer.valueOf(data[3]).doubleValue();
        var year=Integer.valueOf(data[4]).intValue();
        var mes=Integer.valueOf(data[5]).intValue();
        var dia=Integer.valueOf(data[6]).intValue();
        
        if(peso<0 || estatura<0){
            retorno+=" Peso o estatura no son correctas";
        }else{
            var profesor = new Profesor(90,"luis",81.05,"Ingenirea",LocalDate.of(2022, Month.MARCH, 10));
            this.profesorServiceImpl.crear(profesor);
            retorno= "Profesor "+profesor.getNombre()+" creado correctamente";
        }
        return retorno;
    }
}
