package jv.intermediario.enums.enum4;

public class Main {
    public static void main(String[] args) {

        /*for (TipoDocumento tipoDocumento : TipoDocumento.values()) {
            System.out.println(tipoDocumento + " - " + tipoDocumento.geraNumeroTest());
        }*/

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTest());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTest());
        System.out.println(pj);

    }
}
