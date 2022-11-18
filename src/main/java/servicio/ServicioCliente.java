/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
interface ServicioCliente {
    public abstract void crear(Cliente cliente);

    public abstract void modificar(int codigo, Cliente ClienteModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Cliente> listar(); 
}
