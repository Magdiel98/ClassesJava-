public class Main {
    public static void main(String[] args) {
        Carro opala = new Carro();

        opala.caracMotor("Gasolina", 4);
        opala.atribuirCor("Preto");
        opala.atribuirPreco(200.000);

        opala.imprimir();

    }
}