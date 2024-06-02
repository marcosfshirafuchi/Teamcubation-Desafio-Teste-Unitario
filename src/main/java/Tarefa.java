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
public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public void setDescricao(String descricao) {
        this.descricao =descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
