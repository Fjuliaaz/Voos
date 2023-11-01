package br.senai.sp.jandira.model;

public class companhiasAereas extends Cadastro{

        public companhiasAereas(String companhias, String destino, String origem, String horaSaida,
                                String dataPartida, Integer numeroVoo, Integer Npassageiros){
            super("Emirates", "Bahamas","Guarulhos", "9:15 AM", "17/01/2024", 157, 350 );
        }

    @Override
    public String print() {
        return "Voo Emirates\n" + super.print();
    }
    }
