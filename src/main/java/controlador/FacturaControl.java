/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Factura;
import servicio.ServicioFacturaImpl;

/**
 *
 * @author JuanFernandez
 */
public class FacturaControl {
    public ServicioFacturaImpl facturaServiceImpl;

    public FacturaControl() {
        this.facturaServiceImpl = new ServicioFacturaImpl();
    }
    public String crear(String [] data){
        var retorno="No se pudo crear la factura";
        var code=Integer.valueOf(data[0]);
     
        
        if(code==0){
            retorno+=" No existe codigo de transaccion";
        }else{
            var factura = new Factura("Benavides",1085,"Cuenca");
            this.facturaServiceImpl.crear(factura);
            retorno="Factura "+factura.getNombreEmpresa()+" creado correctamente";
        }
        return retorno;
    }
}
