package lab2my;

import allpokemons.*;
import java.sql.BatchUpdateException;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
    

    public static void main(String[] args) {
        Battle b = new Battle();


        Tangela tangela = new Tangela("tangela",1);
        Diancie diancie = new Diancie("diancie", 1);
        Tangrowth tangrowth = new Tangrowth("tangrowth", 2);
        Cleffa cleffa = new Cleffa("cleffa",1);
        Clefairy clefairy = new Clefairy("clefairy", 2);    
        Clefable clefable = new Clefable("clefable", 3);


        //b.addAlly(tangela);
        //b.addAlly(tangrowth);
        b.addFoe(diancie);
        b.addAlly(cleffa);
        b.addFoe(clefairy);
        b.addFoe(clefable);


        b.go();
    }
}
