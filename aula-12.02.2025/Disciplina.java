import java.util.List;
import java.util.ArrayList;

public class Disciplina{
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private int cargaH;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>(),0);
    }

    public Disciplina(String nomeDisciplina, int cargaH){
        this(nomeDisciplina, new ArrayList<Aluno>(), new ArrayList<Professor>(), cargaH);
    }

    public Disciplina(String nomeDisciplina, List<Aluno> alunos, List<Professor> professores, int cargaH){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
        this.cargaH = cargaH;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }

    public List<Professor> getProfessores(){
        return this.professores;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void setCargaH(int cargaH){
        this.cargaH = cargaH;
    }

    public int getCargaH(){
        return this.cargaH;
    }


    @Override
    public String toString(){
        return "Disciplina{" +
                getNomeDisciplina() +
                ", alunos=" + getAlunos() +
                ", professores=" + getProfessores() +
                ", Carga Horaria=" + getCargaH() +
                "}";
    }
}