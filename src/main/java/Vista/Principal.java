/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Grupo;
import Modelo.Revista;
import controlador.ProfesorControl;





/**
 *
 * @author JuanFernandez
 */
public class Principal {

   public static void main(String[] args) {
      
       var profesorControl=new ProfesorControl();
       var data= new String[7];
       data[0]="90";
       data[1]="Luis ";
       data[2]="80.05";
       data[3]="Ingeniero";
       data[4]="1998";
       data[5]="06";
       data[6]="22";
       System.out.println(profesorControl.crear(data));
      
       var articulo1 = new Articulo("tabaco ","El  pepe",1);
       System.out.println(articulo1);
       
       var cliente1 =new Cliente("Jose","0998522545","01021820889",80);
       System.out.println(cliente1);
       
       var factura1 = new Factura("Nutella",85095,"Capulispamba");
       System.out.println(factura1);
        
       var grupo1 = new Grupo("Mario Rizzinni","10",25);
       System.out.println(grupo1);
       
       var revista1 = new Revista("La isla maravillora",420,LocalDate.of(2022,10,24));
       System.out.println(revista1);
       
    }
   
       
   
}
