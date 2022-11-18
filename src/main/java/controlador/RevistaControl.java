/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Revista;
import java.time.LocalDate;
import servicio.ServicioRevistaImpl;

/**
 *
 * @author JuanFernandez
 */
public class RevistaControl {
     public ServicioRevistaImpl revistaServiceImpl;

    public RevistaControl() {
        this.revistaServiceImpl = new ServicioRevistaImpl();
    }
    
    
    public String crear(String [] data){
        var retorno="No se pudo crear la  revista";
        var paginas=Integer.valueOf(data[1]);
        
        
        if(paginas<=0 ){
            retorno+=" NO contiene paginas";
        }else{
            var revista = new Revista("Viaje al centro de la tierra",407,LocalDate.of(1864, 11, 25));
            this.revistaServiceImpl.crear(revista);
            retorno= "La revista "+revista.getTitulo()+" creado correctamente";
        }
        return retorno;
    }
}
