package controller;

import model.Funcionario;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class ControleFuncionario {
    public static Funcionario contrataFuncionario(int id, String nome, double salario, String tipo, Object... params) {
        switch (tipo) {
            case "TempoIntegral":
                int bancoHoras = (int) params[0];
                return new FuncionarioTempoIntegral(id, nome, salario, bancoHoras);
            case "TempoParcial":
                String horaEntrada = (String) params[0];
                String horaSaida = (String) params[1];
                return new FuncionarioTempoParcial(id, nome, salario, horaEntrada, horaSaida);
            case "Temporario":
                int diaFimContrato = (int) params[0];
                int mesFimContrato = (int) params[1];
                int anoFimContrato = (int) params[2];
                return new FuncionarioTemporario(id, nome, salario, diaFimContrato, mesFimContrato, anoFimContrato);
            default:
                return null;
        }
    }
}