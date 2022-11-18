/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
public class ServicioRevistaImpl implements ServicioRevista{
    private List<Revista> revistaList;

    public ServicioRevistaImpl() {
        this.revistaList= new ArrayList<>();
    }

    

    

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var profesor:this.revistaList){
            if(profesor.getCodigo()==codigo){
                this.revistaList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    

    @Override
    public void crear(Revista Revista) {
        this.revistaList.add(Revista);
    }

    @Override
    public void modificar(int codigo, Revista revistaModificado) {
      
        
        this.revistaList.set(codigo, revistaModificado);
    }

    @Override
    public List<Revista> listar() {
        return this.revistaList;
    }
}

