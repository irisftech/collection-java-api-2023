package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty())
            agendaContatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Carlos" , 1223456);
        agendaContatos.adicionarContato("Selma" , 5668);
        agendaContatos.adicionarContato("Selma Santos" , 14236598);
        agendaContatos.adicionarContato("Selma Silva " , 65423897);
        agendaContatos.adicionarContato("Carlos DIO " , 456879231);
        agendaContatos.adicionarContato("Dani " , 44444444);



        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Selma Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Carlos DIO"));
    }
}


