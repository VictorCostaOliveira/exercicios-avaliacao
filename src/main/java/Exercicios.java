public class Exercicios {

    public float calculaAumentoSalario(float salario, double aumento) {
        if (salario <= 0) {
            return 0;
        } else{
            double porcentagemDeAumento = aumento / 100;
            double quantidadeAumento = salario * porcentagemDeAumento;
            return (float) (salario + quantidadeAumento);
        }
    }

    public boolean vificaPalindromo(String texto) {
        return texto.equals(new StringBuilder(texto).reverse().toString());
    }
}
