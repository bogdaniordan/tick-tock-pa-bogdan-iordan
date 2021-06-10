package controller;

import model.PC;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<PC> ownedPCS = new ArrayList<>();

    public PC buildPC() {
        return new PC();
    }

    public List<PC> buildManyPCs(int numberOfPcs) {
        List<PC> pcs = new ArrayList<>();
        for (int i = 0; i < numberOfPcs; i++) {
            pcs.add(new PC());
        }
        return pcs;
    }
}
