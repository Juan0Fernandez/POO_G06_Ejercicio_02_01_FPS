/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import controlador.ProfesorControl;

/**
 *
 * @author USUARIO
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
    
       
       
       
        
        
    }
}
