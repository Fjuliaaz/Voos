package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Delta;
import br.senai.sp.jandira.model.Emirates;
import br.senai.sp.jandira.model.Gol;

public class Main {

    public static void main(String[] args) {

        Gol vooGol1 = new Gol("Gol", "Bahamas", "Guarulhos", "17:10", "27/10/2024",
                610, 280);


        Emirates vooEmirates1 = new Emirates("Emirates", "Dubai", "Guarulhos", "10:10",
                "30/01/2024", 139, 300);


        Delta vooDelta = new Delta("Delta", "Paris", "Guarulhos", "11:20",
                "23/03/2024", 125, 310);
    }
}
