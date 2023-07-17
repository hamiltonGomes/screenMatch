import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        minhaSerie.setNome("Game of Thrones");
        minhaSerie.setAnoDeLancamento(2013);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(7);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setIncluidoNoPlano(true);

        //atrobuindo notas:
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes()); // realiza a mesma função que a linha de baixo, mas desse modo o metódo padroniza e permite que regra de negócio seja alterada diretamente no método específico
        // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

    }
}