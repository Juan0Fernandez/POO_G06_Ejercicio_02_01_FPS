/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import Modelo.Revista;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
interface ServicioRevista {
    public abstract void crear(Revista Revista);

    public abstract void modificar(int codigo, Revista revistaModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Revista> listar(); 
}
