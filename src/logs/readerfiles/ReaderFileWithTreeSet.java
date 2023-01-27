package logs.readerfiles;

import logs.entities.Turma;
import logs.entities.TurmaWithTreeSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class ReaderFileWithTreeSet {
    Scanner sc = new Scanner(System.in);
    Scanner scMenu = new Scanner(System.in);
    Set<TurmaWithTreeSet> set = new TreeSet<>();

    private String nameOption;

    public void readerFileWithTreeSet() {

        System.out.print("Enter file full path: ");
        String path = "C:\\Dev\\Vivere\\projetos\\cursoonline-set\\files\\" + menu(nameOption);

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                String[] columns = line.split(",");
                String aluno = columns[0];
                String turma = columns[1];
                String periodo = columns[2];
                Date date = Date.from(Instant.parse(columns[3]));

                this.set.add(new TurmaWithTreeSet(aluno, turma, periodo, date));
                line = reader.readLine();
            }

            status();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object menu(String nameOption) {

        System.out.println("Arquivo a ser lido");
        System.out.println("1- turmaA ");
        System.out.println("2- turmaB");
        System.out.println("3- turmaC");
        System.out.println("4-outros");

        int op = scMenu.nextInt();
        String filename = null;

        switch (op) {
            case 1:
                filename = "turmaA";
                break;
            case 2:
                filename = "turmaB";
                break;
            case 3:
                filename = "turmaC";
                break;
            case 4:
                filename=sc.next();
                break;
            default:
                System.out.println("Opção inválida");
        }

        this.nameOption = nameOption;
        nameOption = filename + ".txt";

        return nameOption;
    }


    public void status() {

        System.out.println("Total alunos: " + this.set.size());
    }


}
