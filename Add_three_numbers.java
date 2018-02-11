/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
/**
* Write a description of class cerosFactorial here.
* 
* @authors
* Juan Carlos Monsalve Torres
* Ronal Mauricio Reales Fernandez
* Luis David Roa Saavedra
* 
*/
import java.util.Scanner;
public class Add_three_numbers
{
      public static void main (String[] args){
    Scanner entrada = new Scanner (System.in);
    int suma = 0;
    int numero = 0;
    
    for (int i = 0; i < 3; i++){
        
        System.out.print(" Ingrese el entero " + (i + 1) + " \n ");
        numero=entrada.nextInt ();
        suma = suma + numero;
    } 
    
    System.out.print ("La suma de los tres numeros es: " + suma);
    }
}