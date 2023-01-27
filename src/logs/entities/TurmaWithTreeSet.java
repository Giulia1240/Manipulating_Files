package logs.entities;

import java.util.Date;
import java.util.Objects;

public class TurmaWithTreeSet implements Comparable<TurmaWithTreeSet>{
    private String aluno;
    private String turma;
    private String periodo;
    private Date date;

    public TurmaWithTreeSet(String aluno, String turma, String periodo, Date date) {
        this.aluno = aluno;
        this.turma = turma;
        this.periodo = periodo;
        this.date = date;
    }

    public TurmaWithTreeSet() {
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TurmaWithTreeSet)) return false;
        TurmaWithTreeSet turma = (TurmaWithTreeSet) o;
        return Objects.equals(aluno, turma.aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno);
    }

    @Override
    public String toString() {
        return "turma='" + turma ;
    }

    @Override
    public int compareTo(TurmaWithTreeSet other) {
        return aluno.toUpperCase().compareTo(other.getAluno().toUpperCase());
    }
}
