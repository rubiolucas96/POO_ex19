package model;

public class FuncionarioTempoIntegral extends Funcionario {
    private int bancoHoras;

    public FuncionarioTempoIntegral(int id, String nome, double salario, int bancoHoras) {
        super(id, nome, salario);
        this.bancoHoras = bancoHoras;
    }


    public int getBancoHoras() {
        return bancoHoras;
    }

    public void setBancoHoras(int bancoHoras) {
        this.bancoHoras = bancoHoras;
    }
    

    @Override
    public String tipoContrato() {
        return "Funcionário de Tempo Integral";
    }
}