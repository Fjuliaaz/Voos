package br.senai.sp.jandira.model;

public class Delta extends Voo{
    public Delta(String companhias, String destino, String origem, String horaSaida,
                 String dataPartida, int numeroVoo, int Npassageiros) {

        super("Delta", "Paris", "Guarulhos", "11:20 AM",
                "23/03/2024", 125, 310);
    }

    @Override
    public String print() {
        return "Voo \n" + super.print();
    }
}
