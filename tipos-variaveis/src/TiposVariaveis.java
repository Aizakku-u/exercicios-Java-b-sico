import java.sql.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //pontuação quer dizer vírgula e não milhar
        double salarioMinimo = 2.500; //2,5
        double salarioMinimo2 = 2500.33;//2.500,33

        //float tem que terminar em F senão pode dar erro
        float pi = 3.14;
        pi = 3.14F;

        //uma caixa pequena cabe em uma caixa grande, não o contrário (para resolver vc dá um cast ou transforma os dois em uma caixa grande)
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;

        //variáveis podem mudar de valor
        int numero = 1;
        numero = 2;

        //porém constantes(final) não mundam a nao ser que vc mesmo mude o valor original dela
        final double valor_de_pi = 3.14;//o final define que essa é a versão final de uma "variável"
        valor_de_pi = 10;
        
        public static void main(String[] args) {
            //OPERADORES
    
            //Atribuição - "="
            String nome = "Isaac";
            int idade = 18;
            double peso = 58.83;
            char sexo = 'M';
            boolean doadorSangue = false;
            Date dataNascimento = new Date9();
    
    
            //Aritmétricos - "+(adição), -(subteação), *(multiplicação), /(divisão)"
            double soma = 10.5 + 15.7;
            int subteação = 113 - 25;
            int multiplicação = 20 * 7;
            int divisão = 15 / 3;
            int modulo = 18 % 3; //entrega o resultado de uma divisão fracionada em números float
            double resultado = (10 * 7) + (20 / 4); //os parênteses dão prioridade àquela equação
    
            String nomeCompleto = "Isaac" + "Castro"; //o operador de soma(+) também funciona pra concatenar strings, juntando-as
            
    
        }

    }
}
