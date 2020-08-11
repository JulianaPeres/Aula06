package exercicio06;

public class Funcionario {
    
    private String nomee;
    private int horas;
    private float valorhora;

    public Funcionario (String nomee, int horas, float valorhora){
       this.nome = nome;
       this.horas = horas;
       this.valorhora = valorhora;        
    }

    public float calculasalario (){
        return horas * valorhora;
    }

    @Override
    public String toString() {
       return nomee + "-" + valorhora + "-" + horas;
    }

    }


