public class ContaCorrente extends Conta{
    
    public ContaCorrente(final int numero) {
        super(numero);
    }

    @Override
    public void depositar(final double valor) {
        super.depositar(valor - 0.1);
    }

    @Override
    public boolean saque(final double valor) {
        if(valor > 0 && valor <= getSaldo()){
            super.saque(valor);
            return true;
        }else{
            return false;
        }
    }

}