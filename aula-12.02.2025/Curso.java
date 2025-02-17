import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nomeCurso;
    private List<Disciplina> disciplinas;

public Curso(){
    this("");
}

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setNomeDisciplina(List<Disciplina> disciplinas){
        this.disciplinas= disciplinas;
    }

    public ArrayList<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public int cargaHorariaTotal(){
        int cargaH = 0;
        for (Disciplina  n : disciplina) {
            cargaH += n.getCargaH();
        }
        return cargaH;
    }

    @Override
    public String toString(){
        return "Curso{" +
                "NomeCurso=" + getNomeCurso() +
                "cargaHoraria=" + cargaHorariaTotal() +
                "Disciplinas=" + getDisciplinas() +
                "}";
    }
}