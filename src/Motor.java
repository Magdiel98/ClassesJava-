public class Motor {
    private String combustivel = " ";

    private int quantVelas = 0;

    void atribuirCombustivel(String _combustivel)
    {
        this.combustivel = _combustivel;
    }
    void atribuirVelas(int velas)
    {
        this.quantVelas = velas;
    }

    String impCombustivel()
    {
        return this.combustivel;
    }

    int imVelas()
    {
        return this.quantVelas;
    }

}
