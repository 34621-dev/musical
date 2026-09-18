package app;

import model.InstrumentoMusical;
import model.Violao;
import model.Bateria;

import java.util.ArrayList;
import java.util.List;

public class TesteBanda {
    public static void main(String[] args) {
        
        Violao violao = new Violao("Violão Acústico", "Madeira", 6);
        Bateria bateria = new Bateria("Bateria Acústica", "Metal", 5);

        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        System.out.println("--- ENSAIO DA BANDA ---");
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.getNome() + ": " + instrumento.tocar());
        }

        int afinadosCount = 0;
        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                afinadosCount++;
            }
        }

        System.out.println("\nTotal de instrumentos afinados: " + afinadosCount + " de " + instrumentos.size());

    }
}