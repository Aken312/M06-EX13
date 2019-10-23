package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File clients = new File("/home/dam2a/Escriptori/Clients.csv");

        BufferedReader inputStream = new BufferedReader(new FileReader(clients));
        String line = new String();
        String[] texto = new String[(int) clients.length()];

        for (int i = 0; i < clients.length(); i++) {
            line = inputStream.readLine();

            if (line != null) {
                for (int j = 0; j < clients.length(); j++) {
                    texto[j] = line;
                }
                BufferedWriter bw;
                try {
                    FileWriter fw = new FileWriter("/home/dam2a/Escriptori/ej13.csv");
                    bw = new BufferedWriter(fw);

                    for (int j = 0; j < clients.length(); j++) {
                       {
                            bw.write(texto[j]);

                            bw.newLine();
                        }
                        bw.flush();


                    }
                    bw.close();


                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            }
        }
    }
}









//public class Main{
//    public static void main(String []args){
//        String[] text = {"Mihaita","Minca","21"};
//
//        try{
//            FileWriter fw = new FileWriter("/home/dam2a/Escriptori/ej12.csv");
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            for (String t:text){
//                bw.write(t);
//                bw.newLine();
//            }
//            bw.close();


//        Exercici 13
//        Implementa la classe CSVToScreen.java que
//        en llegir un fitxer csv on els diferents
//        camps es defineixen en la primera fila
//        : firtname, lastname, username, password,
//        email .
//        La sortida generada pel programa serà
//        semblant a la següent:
//        Persona 1
//        firtname: Joan Anton
//        lastname: Pérez Braña
//        username: joan
//        password: Noteolvid3$
//        email: joan@iespuigcastellar.xeill.net
//****
//        Persona 2
//....
//        Cal tenir en compte que les columnes poden permutar i la sortida caldria que fos igual de coherent. Per això es decideix emmagatzemar els valors de la primera fila d'entrada en un array String[].



//    public static void main(String[] args) throws IOException {
//File file = new File("/home/dam2a/Escriptori/alphabeta.txt");
//File file2 = new File("/home/dam2a/Escriptori/alphabeta2.txt");

// BufferedReader inputStream = new BufferedReader(new FileReader(file));
// BufferedWriter outputStream = new BufferedWriter(new FileWriter(file2));
// String line;
// for (int i = 0; i < file.length(); i++) {
// line = inputStream.readLine();
// if (line !=null) {
// outputStream.write(line);
// outputStream.newLine();
// }
// }
// inputStream.close();
// outputStream.close();
// }
// }
