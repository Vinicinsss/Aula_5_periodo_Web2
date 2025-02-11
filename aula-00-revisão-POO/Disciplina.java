import java.util.List;

public class Disciplina{
    private String nomeDiscpilina;
    private List<aluno> alunos;
    private List<Professor> professores;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Aluno>());
    }

    public Disciplina(String nomeDiscpilina){
        this(nomeDiscpilina, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDiscpilina,List<Aluno> alunos, List<Professor> professores){
        this.nomeDiscpilina = nomeDiscpilina;
        this.alunos = alunos;
        this.professores = professores;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDiscpilina = nomeDiscpilina;
    }

    public String getNomeDisciplina(){
        return nomeDisciplina;
    }

    public void setAluno(List<Alunos> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }

    public List<Professores> getProfessores(){
        return this.professores;
    }

    public void addAlunp(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString(){
        return "Disciplina{" +
                getNomeDisciplina()+
                ", alunos=" + getAlunos() +
                ", professores=" + getProfessores()+
                "}";
    }
}