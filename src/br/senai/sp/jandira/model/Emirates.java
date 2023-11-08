package br.senai.sp.jandira.model;

public class Emirates extends Voo{

    public Emirates(String companhias, String destino, String origem, String horaSaida,
                    String dataPartida, int numeroVoo, int Npassageiros) {

        super("Emirates", "Dubai", "Guarulhos", "10:10 AM",
                "30/01/2024", 139, 300);
    }

    @Override
    public String print() {
        return "Voo \n" + super.print();
    }
}
