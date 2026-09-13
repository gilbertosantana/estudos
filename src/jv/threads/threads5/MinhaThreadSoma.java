package jv.threads.threads5;

public class MinhaThreadSoma implements Runnable{

    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums){
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(STR."\{nome} iniciada");

        int soma = calc.somaArray(nums);

        System.out.println(STR."Resultado da soma para thread \{nome} é: \{soma}");

        System.out.println(STR."\{nome} terminada");
    }
}
