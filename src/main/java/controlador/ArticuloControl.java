/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Articulo;
import servicio.ServicioArticuloImpl;

/**
 *
 * @author JuanFernández
 */
public class ArticuloControl {
   public ServicioArticuloImpl articuloServiceImpl;

    public ArticuloControl() {
        this.articuloServiceImpl = new ServicioArticuloImpl();
    }
    public String crear(String [] data){
        var retorno="No se pudo crear el Articulo";
        var numpa=Integer.valueOf(data[2]);
        
        
        if(numpa==0)
        {
            retorno+=" numero de planas no son correctas";
        }else{
            var articulo = new Articulo("La Discriminacion","El Pepe",1);
            this.articuloServiceImpl.crear(articulo);
            
            retorno= "Articulo "+ articulo.getTema()+" creado correctamente";
        }
        return retorno;
    } 
}
