package OOPS;
class Pokemon{
    int power;
    String type;
    Pokemon(){

    }
    Pokemon(int power, String type){
        this.power = power;
        this.type = type;
    }
    void print(){
        System.out.println(" Power " + this.power + " type " + type);
    }
}
class StrongPokemon extends Pokemon{
    int speed;
}

class LegendaryPokemon extends Pokemon{
    String ability;
}

class GodPokemon extends LegendaryPokemon{
    char tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        mewtwo.print();

        Pokemon pikachu = new Pokemon();
        GodPokemon dialga = new GodPokemon();;
    }
}
