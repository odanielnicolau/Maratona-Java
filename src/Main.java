

// #6. PROGRAMAÇÃO DINAMICA COM VARIAVEIS

public class Main {
    public static void main(String[] args) {
        var name = "Daniel";
        var password = "834648";
        System.out.println(name);
        System.out.println(password);


    // int = número inteiro
    // String = palavras (sempre o "S" maiusculo)
    // double = número fracionados
    // booleanas = verdadeiro ou falso

    var num1 = 2;
    var num2= 5;

        System.out.println(num1+num2);

    double percent = 34.58;
    boolean isDriver = true;

        System.out.println(percent);
        System.out.println(isDriver);


// #8. FUNÇÕES

        int x;
        int y;

        soma(x = 30, y= 50);
    }
    // "static void [NOME DA FUNC]" -> declaração padrão.
    // "soma" -> nome da função.
    // "()" -> para definir oq chegará naquela função.
    //"{}" -> bloco de código que será executado.


    //oq está dentro dos "()" na função, são chamados de parâmetreos. Ex: "static void soma(int x, int y)", "(int x, int y)"
    //são os parâmetros da função.
    static void soma(int x, int y){
        System.out.println(x+y);
    }


// #9. ARGUMENTOS
    //Exercícios:
    // 1. Saudação Personalizada
    // Objetivo: Criar um método que receba um nome e imprima:
    // "Olá, [nome]! Bem-vindo ao Java!"

    static void parametros(String[] nome){
        nome= "Daniel"
        System.out.println("Ola" +nome);
    }



}