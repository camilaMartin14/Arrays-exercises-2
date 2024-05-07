package arrays2;

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
/*
1. Requests a phrase trough the console and saves all its characters
in an array.
*/
    Scanner sc = new Scanner (System.in);
    sc.useDelimiter("\n");
    
    System.out.println("Hello! Write a phrase please");
    String frase = sc.next ();
    //1° forma
    char [] caracteres = new char [frase.length()];
    
    char caracter;
        for (int i = 0; i < caracteres.length; i++) {
        caracter = frase.charAt(i);
        caracteres[i] = caracter;
        }
        mostrarArray(caracteres);
        System.out.println("-------------------------------------------");
/*
2. Given two arrays created by you, merge them into one   
*/    
    int[] a = {1,2,3,4,5};
    int[] b = {6,7,8,9,10};
    
    int[] c = new int [a.length+b.length];
    
    for (int i = 0; i < a.length; i++) {
        c[i] = a[i];
        }

    for (int i = 0; i < b.length; i++) {
        c[a.length + i] = b[i];
        }      
        mostrarArray(c);
        System.out.println("-------------------------------------------");
/*
3. Given an array of numbers, indicate which is the most repeated element, in case
of a tie, show the last most repeated element.
*/   
        int [] tres = {1,5,4,6,6,1,2,4,3,3,6,5,5,6};
    
       
        int mayor = 0;
        int mayorRepeticiones = 0;
    
        int numeroBuscado;//primer bucle
        int numeroActual;//bucle anidado
        for (int i = 0; i < tres.length; i++) {
          numeroBuscado = tres[i];
            int contador = 0;
            
            for (int j = 0; j < tres.length; j++) {
                numeroActual = tres[j];
                if (numeroBuscado == numeroActual) {
                    contador++;
                }
            }
            if (contador >= mayorRepeticiones) {
                mayor = numeroBuscado;
                mayorRepeticiones = contador; 
                } 
            
            }
            System.out.println("The most repeated number is " + mayor + " with " +mayorRepeticiones+ " repes");
            System.out.println("-------------------------------------------");

/*
4. Given an array of characters (given by the exercise) and your ID number, you
            must take the letter from your ID (DNI). 
            To obtain it you only have to take the module of 23 and that will be
            the index of the array.
*/
    Scanner kb = new Scanner (System.in);

    char letrasNIF[] = { 'T','R','W','A','G','M','Y','F',
        'P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
        System.out.println("Write your ID");
        int dni = kb.nextInt();
        
        final int DIVISOR = 23;
        
        int indiceLetra = dni % DIVISOR;
        
        System.out.println(dni+""+letrasNIF[indiceLetra]);;
        System.out.println("-------------------------------------------");

/*
Having an array of String with the name of people and another of numbers with
their age, indicates who is the oldest person.
*/ 
    String [] names = {"Fernando", "Jaime", "Alberto", "Carlos"};
    int [] ages = {28,31,20,40};
    
    int older = ages [0];
    int olderIndex = 0;
    
        for (int i = 0; i < ages.length; i++) {
         
            if (ages [i] > older){
                older = ages [i];
                olderIndex = i;
            }
        }
        System.out.println("The older person is "+names[olderIndex]+ " with " + older + " years");
    
    
    
    
    
    }

    //1.
    public static void mostrarArray (char [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);   
        }
    }
    //2.
    public static void mostrarArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}





//2° forma ejercicio 1.
/* char[]caracteres = frase.toCharArray();
mostrarArray (caracteres);*/
