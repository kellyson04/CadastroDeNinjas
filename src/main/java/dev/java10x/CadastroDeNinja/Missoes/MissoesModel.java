package dev.java10x.CadastroDeNinja.Missoes;

import dev.java10x.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "missao_nome")
    private String nome;

    @Column(name = "missao_dificuldade")
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") //uma missao pode ter varios ninjas
    private List<NinjaModel> ninjas;
}
