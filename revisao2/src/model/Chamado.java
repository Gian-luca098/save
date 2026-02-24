package model;

import java.time.LocalDate;


public class Chamado {
    private Integer numero;
    private String titulo;
    private LocalDate data;
    private String descricao;
    private PrioridadeChamdo prioridade;
    private StatusChamado status;
    private Cliente cliente;

    public Chamado(){}

    public Chamado(Integer numero, String titulo, LocalDate data, String descricao, PrioridadeChamdo prioridade, StatusChamado status, Cliente cliente) {
        this.numero = numero;
        this.titulo = titulo;
        this.data = LocalDate.now();
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = StatusChamado.ABERTO;
        this.cliente = cliente;
    }

}
