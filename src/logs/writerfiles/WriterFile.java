package logs.writerfiles;

import java.io.*;
import java.util.Scanner;

public class WriterFile {
    public void writeFile() {

        Scanner sc = new Scanner(System.in);
        Scanner newOption = new Scanner(System.in);
        System.out.println("Qual turma o aluno irá particpar? ");
        System.out.println("1- TURMA A ");
        System.out.println("2- TURMA B");
        System.out.println("3- TURMA C");

        int opcao = sc.nextInt();
        String filename = null;

        switch (opcao) {
            case 1:
                filename = "turmaA";
                break;
            case 2:
                filename = "turmaB";
                break;
            case 3:
                filename = "turmaC";
                break;
        }

        try {
            String path = "C:\\Dev\\Vivere\\projetos\\cursoonline-set\\files\\";
            FileOutputStream fileWriter = null;
            if (filename.equals(null)) {
                fileWriter = new FileOutputStream(path + filename + ".txt");
            } else {
                System.out.println("Este arquivo ja contém dados, deseja reescrever?");
                System.out.println("1- SIM");
                System.out.println("2- NÃO");
                int escolha = newOption.nextInt();

                if (escolha == 1) {
                    fileWriter = new FileOutputStream(path + filename + ".txt");
                } else {
                    String newFileName = sc.next();
                    fileWriter = new FileOutputStream(path + newFileName + ".txt");
                }
            }
            Writer wr = new OutputStreamWriter(fileWriter);
            BufferedWriter br = new BufferedWriter(wr);

            int limite = 10;
            System.out.println("Limite máximo de alunos para cada turma:" + limite);

            System.out.println(" Cadastro aluno: ");
            for (int i = 0; i < limite; i++) {
                String w = sc.next();
                br.write(w);
                br.newLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
