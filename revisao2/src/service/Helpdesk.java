package service;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
public class Helpdesk {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Chamado> chamados = new ArrayList<>();

    //operaçoes do cliente
    public void cadastrarCliente(String nome, String email) {
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEmail(email);
        clientes.add(c);
    }

    public Cliente buscarCliente(String email) {
        for (Cliente c : clientes) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                return c;
            }
        }
    return null;
}

        //Operaçao do chamdo
        public void abrirChamado (Integer numero, String titulo, String descricao, PrioridadeChamdo
        prioridade, Cliente cliente){
            if (numero == null) return;
            Chamado ch = new Chamado();
            ch.setNumero(numero);
            ch.setTitulo(titulo);
            ch.setData(LocalDate.now());
            ch.setDescricao(descricao);
            ch.setPrioridade(prioridade);
            ch.setStatus(StatusChamado.ABERTO);
            ch.setCliente(cliente);
            chamados.add(ch);
        }
    public Chamado buscarChamado(Integer numero) {
        for (Chamado ch : chamados) {
            if (ch.getNumero().equals(numero)) {
                return ch;
            }
        }
        return null;
    }
}
