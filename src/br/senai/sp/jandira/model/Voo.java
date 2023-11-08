package br.senai.sp.jandira.model;

abstract class Voo {
        private String companhias, origem, destino, horaSaida, dataPartida;
        private int Npassageiros, numeroVoo;

        public Voo(String companhias, String destino, String origem, String horaSaida,
                   String dataPartida, Integer numeroVoo, Integer Npassageiros){

            this.companhias = companhias;
            this.destino = destino;
            this.origem = origem;
            this.horaSaida = horaSaida;
            this.dataPartida = dataPartida;
            this.numeroVoo = numeroVoo;
            this.Npassageiros = Npassageiros;
        }

        public String print() {
            return "Companhias: " + companhias + "\n" +
                    "Destino: " + destino + "\n" +
                    "Origem: " + origem + "\n" +
                    "Hora de Saída: " + horaSaida + "\n" +
                    "Data de Saída: " + dataPartida + "\n" +
                    "Número do Voo: " + numeroVoo + "\n" +
                    "Numero de Passageiros: " + Npassageiros;
        }
    }


