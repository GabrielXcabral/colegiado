package main.java.br.edu.ifpb.pweb2.genpdf.model;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String fone;
    private String matricula;
    private String login;
    private String senha;
 
}