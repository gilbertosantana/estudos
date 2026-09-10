package jv.intermediario.enums.enum4;

public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTest() {
            return GeraCpfCnpj.cpf();
        }
    },
    CNPJ {
        @Override
        public String geraNumeroTest() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTest();
}
