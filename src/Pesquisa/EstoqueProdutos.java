package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public  class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod,new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos () {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreço();
            }

        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro (){
      Produto produtoMaisCaro = null ;
      double maiorPreço = Double.MIN_VALUE;
      for(Produto p: estoqueProdutosMap.values()) {
          if(p.getPreço() > maiorPreço) {
              produtoMaisCaro = p;
          }
      }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L , "Produto A" , 10, 5.0);
        estoque.adicionarProduto(2L , "Produto B" , 5, 10.0);
        estoque.adicionarProduto(3L , "Produto C" , 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ + estoque.caucularValorTotalEstoque");
        System.out.println("Valor total do estoque: R$ + estoque.obterProdutoMaisCaro");
    }

}
