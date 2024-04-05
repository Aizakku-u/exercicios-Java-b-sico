import java.sql.Date;

public class Operadores{
    public static void main(String[] args) {
        
        //OPERADORES
    
        //Atribuição - "="
        String nome = "Isaac";
        int idade = 18;
        double peso = 58.83;
        char sexo = 'M';
        boolean doadorSangue = false;
        /*Date dataNascimento = new Date(sexo);*/
    
    
        //Aritmétricos - "+(adição), -(subteação), *(multiplicação), /(divisão)"
        double soma = 10.5 + 15.7;
        int subteação = 113 - 25;
        int multiplicação = 20 * 7;
        int divisão = 15 / 3;
        int modulo = 18 % 3; //entrega o resultado de uma divisão fracionada em números float
        double resultado = (10 * 7) + (20 / 4); //os parênteses dão prioridade àquela equação
    
        String nomeCompleto = "Isaac" + "Castro"; //o operador de soma(+) também funciona pra concatenar strings, juntando-as
        System.out.println(nomeCompleto);

        //Unários - "(+), (++), (-)"
        //operadores unários 'transformam as sentenças em positivo(+), sentença mais um(++), negativo(-) e sentença menos um(--)'

        int numero1 = 5;
        
        System.out.println(numero1);

        int numero2 = 5;

        numero2 = - numero2;

        numero2 = numero2 * -1; //multiplicar um número por -1 o transforma de volta de negativo para positivo

        System.out.println(numero2);

        int numero3 = 5;

        numero3 = + numero3;
        System.out.println(numero3);

        int numero4 = 5;

        numero4 = ++ numero4;
        System.out.println(numero4);

        int numero5 = 5;

        numero5 = numero5 --;
        System.out.println(numero5);


        //BÔNUS: Inversão de valores booleanos "!"

        boolean variavel = true;
        System.out.println(!variavel); //a inversão sóocorre na hora do print, ou seja ele não altera a variável eternamente, só por aquele momento

        variavel = !variavel; //também é possível inverter a variável assim ao invés de digitar "variavel = false;"
        System.out.println(variavel);
        System.out.println(!variavel); //inverti a inversão

        //Ternários
        //é basicamente o IF e ELSE, porém escrito em uma só linha. Representado por 'if'(?) e 'else'(:)

        int a, b;

        a = 5;
        b = 6;
        
        //exemplo usando IF e ELSE
        
        /*String resul = "";
        if (a==b) {
            resul = "correto";
        }
        else{
            resul = "incorreto";
        }
        System.out.println(resul);*/

        //exemplo usando ? e :
        /*String resul = a==b ?"verdadeiro" : "falso";
        System.out.println(resul);*/

        //RELACIONAIS
        //basicamente são operadores que se referem a duas variáveis para ver se são iguais(==), diferentes(!=), maior que(>), maior ou igual(>=), menor que(<) e menor ou igual(<=)
        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        
        if (num1 < num2) {
            System.out.println("A nossa condição é verdadeira!");
        }

        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        simNao = num1 != num2;

        System.out.println("Numero 1 é diferente de numero 2? " + simNao);

        simNao = num1 > num2;

        System.out.println("Numero1 é maior que numero 2? " + simNao);

        simNao = num1 < num2;

        System.out.println("Numero 1 é menor que numero 2? " + simNao);

        //LÓgicos
        //é basicamente tabela verdade. Usa-se E(&&) e OU(||)

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }
}