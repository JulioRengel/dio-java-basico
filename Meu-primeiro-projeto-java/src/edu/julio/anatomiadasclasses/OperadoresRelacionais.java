package edu.julio.anatomiadasclasses;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //classe Operadores.java

    String nomeUm = "Julio";
    String nomeDois = new String("Julio");

    System.out.println(nomeUm.equals(nomeDois));

int numero1 = 1;
int numero2 = 2;

boolean simNao = numero1 == numero2;

if (numero1 < numero2) {
    System.out.println("A nossa condição é verdadeira");
}

System.out.println("numeroUm é igual a numeroDois? " + simNao);

simNao = numero1 != numero2;

System.out.println("numeroUm é diferente de numeroDois? " + simNao);

simNao = numero1 > numero2;

System.out.println("numeroUm é maior que numeroDois? " + simNao);

/* 
if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");jav
        */
    }
}
