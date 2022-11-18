/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Cliente;

import servicio.ServicioClienteImpl;

/**
 *
 * @author JuanFernandez
 */
public class ClienteControl {
    public ServicioClienteImpl clienteServiceImpl;

    public ClienteControl() {
        this.clienteServiceImpl = new ServicioClienteImpl();
    }
    public String crear(String [] data){
        var retorno="No se pudo crear al cliente";
        var estatura=Integer.valueOf(data[0]);
        var peso=Double.valueOf(data[2]);
        
        if(peso<0 || estatura<0){
            retorno+=" Peso o estatura no son correctas";
        }else{
            var cliente = new Cliente("Jose","0999944307","0105894452",180);
            this.clienteServiceImpl.crear(cliente);
            
            retorno= "Cliente "+cliente.getNombre()+" creado correctamente";
        }
        return retorno;
    }
}
