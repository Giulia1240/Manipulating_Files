package logs.entities;

import java.util.Date;
import java.util.Objects;

public class Turma {
    private String aluno;
    private String turma;
    private String periodo;
    private Date date;

    public Turma(String aluno, String turma, String periodo, Date date) {
        this.aluno = aluno;
        this.turma = turma;
        this.periodo = periodo;
        this.date = date;
    }

    public Turma() {
    }

    public String getUserName() {
        return aluno;
    }

    public void setUserName(String aluno) {
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
        if (!(o instanceof Turma)) return false;
        Turma turma = (Turma) o;
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
}
