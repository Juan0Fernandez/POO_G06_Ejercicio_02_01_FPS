/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ServicioProfesorImpl implements ServicioProfesor{
    private List<Profesor> profesorList;

    public ServicioProfesorImpl() {
        this.profesorList= new ArrayList<>();
    }

    @Override
    public void crear(Profesor profesor) {
        this.profesorList.add(profesor);
    }

    @Override
    public void modificar(int codigo, Profesor profesorModificado) {
        var indice=0;
        
        this.profesorList.set(indice, profesorModificado);
    
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var profesor:this.profesorList){
            if(profesor.getCodigo()==codigo){
                this.profesorList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Profesor> listar() {
        return this.profesorList;
    }
    
}
