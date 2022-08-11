/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listcalc;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author juancbfor
 */
public class Listcalc {

    public static void main(String[] args) {
       
       List<Double> calculadora;
       calculadora = new ArrayList<>();
       String entrada1;
       String entrada2;
       char decision='s';
       
       while(decision == 's' ){
       
       entrada1=JOptionPane.showInputDialog(null, "Introduce el primero digito");
       Double conventrada1=Double.parseDouble(entrada1);
       entrada2=JOptionPane.showInputDialog(null, "Introduce el siguiente digito");
       Double conventrada2=Double.parseDouble(entrada2);
       
       calculadora.add(conventrada1);
       calculadora.add(conventrada2);
       
       String opcion=JOptionPane.showInputDialog(null, "Selecciona una de las siguientes opciones: 1. Sumar. 2. Restar. 3. Multiplicar. 4. Dividir");
       Double convopcion=Double.parseDouble(opcion);
           
           if(convopcion == 1.0){
        Double operacion = calculadora.get(0)+calculadora.get(1);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + operacion);
       }else if(convopcion == 2.0){
        Double operacion = calculadora.get(0)-calculadora.get(1);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + operacion); 
       } else if (convopcion==3.0){
           Double operacion = calculadora.get(0)*calculadora.get(1);
           JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + operacion); 
       }else if(convopcion==4.0){
           Double operacion = calculadora.get(0)/calculadora.get(1);
           JOptionPane.showMessageDialog(null, "El resultado de la división es: " + operacion);
       }
       
       decision= JOptionPane.showInputDialog(null,"Escriba s o n para seguir realizando operaciones").charAt(0);
       
       }
       
    }

}
