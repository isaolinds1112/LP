package br.cefetmg.rdc.lab20250722;

public class funcionario{
    int codigo;
    String nome;
    double hrs;
    double extras;
    
    public funcionario(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.hrs = 0;
        this.extras = 0;
    }
    
    public void addHoras(double h){
        hrs += h;
        if (h > 8){
            extras += (h - 8);
        }
    }
}
