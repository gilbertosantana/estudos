package jv.intermediario.enums.exercicio;

public enum Operacoes {
    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String simbolo;

    Operacoes(String operacao) {
        this.simbolo = operacao;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return simbolo;
    }
}
