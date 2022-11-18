/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import Modelo.Articulo;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
interface ServicioArticulo {
    public abstract void crear(Articulo articulo);

    public abstract void modificar(int codigo, Articulo ArticuloModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Articulo> listar(); 
}
