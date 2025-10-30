import NewPackage.Auto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Auto toyota = new Auto();

    toyota.setModel("Toyota Supra");
    toyota.setCuloare("neagra");
    toyota.setMasa(1570);
    toyota.setViteza(150.50f);
    toyota.setNumberDeUsi(2);
    toyota.setTipCaroserie("coupe");

        System.out.println("Masina de model " + toyota.getModel() + " de culoare " + toyota.getCuloare() + " cu caroseria "
        + toyota.getTipCaroserie() + " cu " + toyota.getNumberDeUsi() + " usi" + " si masa " + toyota.getMasa() + "kg " +
                "se misca cu viteza " + toyota.getViteza() + "km/h.");


    }
}