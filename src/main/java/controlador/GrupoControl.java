/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Grupo;
import java.time.LocalDate;
import servicio.ServicioGrupoImpl;

/**
 *
 * @author JuanFernandez
 */
public class GrupoControl {
    public ServicioGrupoImpl grupoServiceImpl;

    public GrupoControl() {
        this.grupoServiceImpl = new ServicioGrupoImpl();
    }
    public String crear(String [] data){
        var retorno="No se pudo crear el grupo";
        var numeroEstudiantes=Integer.valueOf(data[2]);
     
        
        if(numeroEstudiantes==0){
            retorno+=" No hay ningun estudiante matriculado";
        }else{
            var grupo = new Grupo("Mario Rizzini","10",25);
            this.grupoServiceImpl.crear(grupo);
            retorno="Grupo "+grupo.getGrupo()+" creado correctamente";
        }
        return retorno;
    }
}
