import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        Filme outroFilme = new Filme();

        outroFilme.setNome("Top Gun");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);

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

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        outroFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes()); // realiza a mesma função que a linha de baixo, mas desse modo o metódo padroniza e permite que regra de negócio seja alterada diretamente no método específico
        // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
        System.out.println(outroFilme.pegaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodio ep = new Episodio();
        ep.setSerie(minhaSerie);
        ep.setTotalVisualizacoes(130);
        filtro.filtra(ep);

        ArrayList<Titulo> listaTitulos = new ArrayList<>(); // irá armazenar objetos da classe Filme
        listaTitulos.add(meuFilme);
        listaTitulos.add(outroFilme);
        listaTitulos.add(minhaSerie);
        System.out.println("Tamanho da lista: " + listaTitulos.size());
        System.out.println("O meu filme é: " + listaTitulos.get(0).getNome());
        System.out.println(listaTitulos);
        System.out.println(listaTitulos.get(0).toString());
        System.out.println(minhaSerie);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Hamilton");
        nomes.add("João");
        nomes.add("Amanda");
        nomes.add("Mayara");
        nomes.add("Guilherme");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        for (Titulo x : listaTitulos) {
            System.out.println("oi");
            System.out.println(x);
        }
    }
}