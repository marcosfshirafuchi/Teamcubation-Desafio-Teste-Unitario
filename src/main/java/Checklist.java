import java.util.ArrayList;
import java.util.List;
/**
 * <h1> Teamcubation - Exercicio - Desafio Teste Unitário</h1>
 * Aqui temos um ChecklistTest, os testes unitários já prontos de uma aplicação de "To Do" (lista de tarefas).<br>
 * O desafio consiste em criar duas classes (Checklist e Tarefa) que vão atender aos 7 testes unitários dessa classe ChecklistTest.<br>
 * O desafio será considerado concluído quando os 7 testes unitários estiverem passando.<br>
 *
 * Lembrando que não se deve alterar a classe ChecklistTest.
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author  Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since   01/06/2024
 */
public class Checklist {
    private List<Tarefa> tarefas;

    public Checklist(){
        this.tarefas = new ArrayList<>();
    }

    public void addTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTodasAsTarefas() {
        return tarefas;
    }

    public List<Tarefa> getTodasAsTarefasConcluidas() {
        List<Tarefa> todasAsTarefasConcluidas = new ArrayList<>();
        for (Tarefa tarefaConcluidas : tarefas){
            if (tarefaConcluidas.isConcluida()){
                todasAsTarefasConcluidas.add(tarefaConcluidas);
            }
        }
        return todasAsTarefasConcluidas;
    }


    public List<Tarefa> getTodasAsTarefasPendentes() {
        List<Tarefa> todasAsTarefasPendentes = new ArrayList<>();
        for (Tarefa tarefaPendentes : tarefas){
            if (!tarefaPendentes.isConcluida()){
                todasAsTarefasPendentes.add(tarefaPendentes);
            }
        }
        return todasAsTarefasPendentes;
    }

    public void alterarStatusTarefa(int id, boolean concluida) {
        for (Tarefa alterarStatusTarefa : tarefas){
            if (alterarStatusTarefa.getId() == id){
                alterarStatusTarefa.setConcluida(concluida);
                break;
            }
        }
    }

    public List<String> getTodasAsDescricoes() {
        List<String> todasAsDescricoes = new ArrayList<>();
        for (Tarefa descricoes : tarefas){
            todasAsDescricoes.add(descricoes.getDescricao());
        }
        return todasAsDescricoes;
    }

    public List<Tarefa> getTodasAsTarefasOrdenadasPorConclusao() {
        tarefas.sort((tarefa1, tarefa2)-> {
            if (tarefa1.isConcluida() && !tarefa2.isConcluida()) {
                return -1;
            } else if (!tarefa1.isConcluida() && tarefa2.isConcluida()) {
                return 1;
            } else {
                return tarefa1.getDescricao().compareTo(tarefa2.getDescricao());
            }
        });
        System.out.println(tarefas);
        return tarefas;
    }
}
