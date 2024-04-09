package model;

public class FuncionarioTemporario extends Funcionario {
    private int diaFimContrato;
    private int mesFimContrato;
    private int anoFimContrato;

    public FuncionarioTemporario(int id, String nome, double salario, int diaFimContrato, int mesFimContrato, int anoFimContrato) {
        super(id, nome, salario);
        this.diaFimContrato = diaFimContrato;
        this.mesFimContrato = mesFimContrato;
        this.anoFimContrato = anoFimContrato;
    }


    public int getDiaFimContrato() {
        return diaFimContrato;
    }

    public void setDiaFimContrato(int diaFimContrato) {
        this.diaFimContrato = diaFimContrato;
    }

    public int getMesFimContrato() {
        return mesFimContrato;
    }

    public void setMesFimContrato(int mesFimContrato) {
        this.mesFimContrato = mesFimContrato;
    }

    public int getAnoFimContrato() {
        return anoFimContrato;
    }

    public void setAnoFimContrato(int anoFimContrato) {
        this.anoFimContrato = anoFimContrato;
    }
    
    // Sobrescrita do método para retornar o tipo de contrato
    @Override
    public String tipoContrato() {
        return "Funcionário Temporário";
    }
}
