package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //Loop de execução continúa do sistema mesmo após a trativa de exceção.
        boolean loop = true;
        while (loop){
            try{
                loop = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }
    }
}
