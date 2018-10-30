package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();
        comparar(a,b,c);
    }

    /*
    La función main sirve para crear la variable scanner e inicializar los valores a, b y c.
     */

    private static void comparar(int a, int b, int c) {
        if (a == b) {
            if (b==c){
                System.out.println("Los números introducidos son iguales");
            }else{
                if(b<c){
                    System.out.println("El orden es: " +c+" "+a+" "+b);
                }else{
                    System.out.println("El orden es: " +a +" "+b+" "+c);
                }
            }
        }else{
            if(b==c){
                if(a<b){
                    System.out.println("El orden es: " +c +" "+b+" "+a);
                }else{
                    System.out.println("El orden es: " +a +" "+b+" "+c);
                }
            }else{
                if(a==c){
                    if(a<b){
                        System.out.println("El orden es: " +b +" "+a+" "+c);
                    }else{
                        System.out.println("El orden es: " +a +" "+c+" "+b);
                    }
                }else{
                    if(a<b){
                        if(a<c){
                            if(b<c){
                                System.out.println("El orden es: " +c +" "+b+" "+a);
                            }else{
                                System.out.println("El orden es: " +b +" "+c+" "+a);
                            }
                        }else{
                            System.out.println("El orden es: " +b +" "+a+" "+c);
                        }
                    }else{
                        if(a<c){
                            System.out.println("El orden es: " +c +" "+a+" "+b);
                        }else{
                            if(c<b){
                                System.out.println("El orden es: " +a +" "+b+" "+c);
                            }else{
                                System.out.println("El orden es: " +a +" "+c+" "+b);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
    Función que compara y muestra oredenadamente 3 números dados mediante un conjunto de if anidados.
     */

}