/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listacaluladora;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juancbfor
 */
public class Listacaluladora {

    public static void main(String[] args) {
       List<Double> calculadora;
       calculadora = new ArrayList<>();
       String entrada1;
       String entrada2;
       
       entrada1=JOptionPane.showInputDialog(null, "Introduce el primero digito");
       Double conventrada1=Double.parseDouble(entrada1);
       entrada2=JOptionPane.showInputDialog(null, "Introduce el siguiente digito");
       Double conventrada2=Double.parseDouble(entrada2);
       
       calculadora.add(conventrada1);
       calculadora.add(conventrada2);
       
       String opcion=JOptionPane.showInputDialog(null, "Selecciona una de las siguientes opciones: 1. Sumar. 2. Restar. 3. Multiplicar. 4. Dividir");
       Double convopcion=Double.parseDouble(opcion);
       
       if(convopcion == 1){
       
       }
       
       
               }
}
