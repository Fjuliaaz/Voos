package br.senai.sp.jandira.model;

public class Gol extends Voo {

    public Gol(String companhias, String destino, String origem, String horaSaida,
               String dataPartida, int numeroVoo, int Npassageiros) {

        super("Gol", "Bahamas", "Guarulhos", "9:15 AM", "17/01/2024", 157, 350);
    }

    @Override
    public String print() {
        return "Voo \n" + super.print();
    }
}
