package model;

public class FuncionarioTempoParcial extends Funcionario {
    private String horaEntrada;
    private String horaSaida;

    public FuncionarioTempoParcial(int id, String nome, double salario, String horaEntrada, String horaSaida) {
        super(id, nome, salario);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    

    @Override
    public String tipoContrato() {
        return "Funcionário de Tempo Parcial";
    }
}