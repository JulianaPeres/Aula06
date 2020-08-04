public class ContaPoupanca extends Conta{
    private static double taxa; //um único atributo para todos os objetos

    public ContaPoupanca(final int numeroConta) {
        super(numeroConta);
    }

    public static void setTaxa(final double taxaPoup) {
        if (taxaPoup > 0) {
            taxa = taxaPoup;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public boolean saque(final double valor) {
        if(valor + taxa <= getSaldo() ){
            return super.saque(valor + taxa);
        }else{
            return false;
        }
    }

}public class ContaPoupanca {
    
}