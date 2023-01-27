package app;

import logs.readerfiles.ReaderFile;
import logs.readerfiles.ReaderFileWithTreeSet;
import logs.writerfiles.WriterFile;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ReaderFile reader = new ReaderFile();
        ReaderFileWithTreeSet readTreeSet = new ReaderFileWithTreeSet();
        WriterFile writer = new WriterFile();

        System.out.println("Operação a realizar: ");
        System.out.println("1-Gerar arquivo ");
        System.out.println("2-Ler arquivo");
        System.out.println("3-Ler arquivo com ordenação de dados");

        int op = scanner.nextInt();

        if (op == 1) {
            writer.writeFile();
        } else if (op == 2) {
            reader.readerFile();
        }else if (op==3){
            readTreeSet.readerFileWithTreeSet();
        }
        else {
            System.out.println("Opção invalida");
        }
        scanner.close();
    }

}

