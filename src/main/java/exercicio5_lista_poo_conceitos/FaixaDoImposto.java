package exercicio5_lista_poo_conceitos;

public class FaixaDoImposto {
    public static int obterFaixa (double salario) {
        if (salario <= 2112) {
            return 1;
        } else if (salario <= 2826.66) {
            return 2;
        } else if (salario <= 3751.06) {
            return 3;
        } else if (salario <= 4664.68) {
            return 4;
        } else {
            return 5;
        }
    }
}
