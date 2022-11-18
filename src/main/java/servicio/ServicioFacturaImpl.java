/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
public class ServicioFacturaImpl implements ServicioFactura {
    private List<Factura> facturaList;

    public ServicioFacturaImpl() {
        this.facturaList= new ArrayList<>();
    }

    public void crear(Factura factura) {
        this.facturaList.add(factura);
    }

    public void modificar(int codigo, Factura facturaModificado) {
        this.facturaList.set(codigo, facturaModificado);
    }

    public void eliminar(int codigo) {
        var indice=0;
        for(var factura:this.facturaList){
            if(factura.getCodigo()==codigo){
                this.facturaList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    public List<Factura> listar() {
        return this.facturaList;
    }

}
