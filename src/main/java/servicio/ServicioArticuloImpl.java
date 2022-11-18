/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
public class ServicioArticuloImpl implements ServicioArticulo {
    private List<Articulo> articuloList;

    public ServicioArticuloImpl() {
        this.articuloList= new ArrayList<>();
    }

    @Override
    public void crear(Articulo articulo) {
        this.articuloList.add(articulo);
        
    }

    @Override
    public void modificar(int codigo, Articulo ArticuloModificado) {
        this.articuloList.set(codigo, ArticuloModificado);
        
    }

    @Override
    public void eliminar(int codigo) {
       var indice=0;
        for(var articulo:this.articuloList){
            if(articulo.getCodigo()==codigo){
                this.articuloList.remove(indice);
                break;
            }else{
                indice++;
            }
        } 
    }

    @Override
    public List<Articulo> listar() {
        return this.articuloList;
    }
}
