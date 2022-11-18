/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFernandez
 */
public class ServicioClienteImpl implements ServicioCliente {

   private List<Cliente> clienteList;

    public ServicioClienteImpl() {
        this.clienteList= new ArrayList<>();
    }

    @Override
    public void crear(Cliente cliente) {
        this.clienteList.add(cliente);
    }

    @Override
    public void modificar(int codigo, Cliente ClienteModificado) {
       
        this.clienteList.set(codigo, ClienteModificado);
    }

    @Override
    public void eliminar(int codigo) {
        var indice=0;
        for(var cliente:this.clienteList){
            if(cliente.getCodigo()==codigo){
                this.clienteList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }

    

  
}
