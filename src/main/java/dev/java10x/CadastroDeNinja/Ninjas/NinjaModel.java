package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em entidade no Banco de Dados
@Entity
//nomear a tabel
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne // varios ninjas podem estar em uma missao
    @JoinColumn(name = "missoes_id") // aq é a foreign key, kk basicamente a chave q faz a junção das duas tabela qnd ambas sao referenciadas
    private MissoesModel missoes;


    public NinjaModel() {
    }

    public NinjaModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
