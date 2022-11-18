/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import Modelo.Grupo;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
interface ServicioGrupo {
    public abstract void crear(Grupo grupo);

    public abstract void modificar(int codigo, Grupo grupoModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Grupo> listar(); 
}
