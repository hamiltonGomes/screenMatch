package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    // aqui ocorre uma sobrecarga de métodos, uma vez que estou repetindo o método acima e mudando apenas o parâmetro que está sendo passado:

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
