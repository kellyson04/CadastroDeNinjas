package dev.java10x.CadastroDeNinja.Ninjas;

import dev.java10x.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em entidade no Banco de Dados
@Entity
//nomear a tabel
@Table(name = "tb_cadastro_de_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
