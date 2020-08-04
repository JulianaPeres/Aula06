package exercicio06;

public class Funcionario {
    
    private String nome;
    private int horas;
    private float valorhora;

    public Funcionario (String nome, int horas, float valorhora){
       this.nome = nome;
       this.horas = horas;
       this.valorhora = valorhora;        
    }

    public float calculasalario (){
        return horas * valorhora;
    }

    @Override
    public String toString() {
       return nome + "-" + valorhora + "-" + horas;
    }

    }


