/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Grupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
public class ServicioGrupoImpl implements ServicioGrupo{
    private List<Grupo> grupoList;

    public ServicioGrupoImpl() {
        this.grupoList= new ArrayList<>();
    }

    @Override
    public void crear(Grupo grupo) {
        this.grupoList.add(grupo);
    }

    @Override
    public void modificar(int codigo, Grupo grupoModificado) {
        
        this.grupoList.set(codigo, grupoModificado);
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var profesor:this.grupoList){
            if(profesor.getCodigo()==codigo){
                this.grupoList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Grupo> listar() {
        return this.grupoList;
    }
}
