/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Profesor;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface ServicioProfesor  {
   public abstract void crear(Profesor profesor);

    public abstract void modificar(int codigo, Profesor profesorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Profesor> listar(); 
}
