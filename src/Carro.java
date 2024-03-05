public class Carro {
    private String cor = " ";
    private double preco = 0;

    private Motor v8 = new Motor();

    void atribuirCor(String _cor)
    {
        this.cor = _cor;
    }

    void atribuirPreco(double _preco)
    {
        this.preco = _preco;
    }

    void caracMotor(String _combustivel, int _velas)
    {
        v8.atribuirCombustivel(_combustivel);
        v8.atribuirVelas(_velas);
    }

    void imprimir()
    {
        System.out.println("Cor: " + this.cor);
        System.out.println("Preço: " + this.preco);
        System.out.println("Combustível: " + this.v8.impCombustivel());
        System.out.println("Quantidade de velas: " + this.v8.imVelas());
    }
}
