/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import Modelo.Factura;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
interface ServicioFactura {
    public abstract void crear(Factura factura);

    public abstract void modificar(int codigo, Factura FacturaModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Factura> listar(); 
}
