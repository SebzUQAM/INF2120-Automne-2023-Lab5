import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NDouble double1 = new NDouble(6);
        NDouble double2 = new NDouble(2);

        System.out.println(double1.add(double2));
        System.out.println(double1.sub(double2));
        System.out.println(double1.mul(double2));
        System.out.println(double1.div(double2));

        System.out.println();

        Fraction fraction1 = new Fraction(3,4);
        Fraction fraction2 = new Fraction(1,3);

        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.sub(fraction2));
        System.out.println(fraction1.mul(fraction2));
        System.out.println(fraction1.div(fraction2));

        System.out.println();

        int index = 0;
        ArrayList<NDouble> nDoubles = new ArrayList<>();
        nDoubles.add(new NDouble(index++));
        nDoubles.add(new NDouble(index++));
        nDoubles.add(new NDouble(index++));
        nDoubles.add(new NDouble(index++));
        nDoubles.add(new NDouble(index++));

        System.out.println(somme(nDoubles));

        System.out.println();


        index = 1;
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(index + 1, 2 * index++));
        fractions.add(new Fraction(index + 1, 2 * index++));
        fractions.add(new Fraction(index + 1, 2 * index++));
        fractions.add(new Fraction(index + 1, 2 * index++));
        fractions.add(new Fraction(index + 1, 2 * index++));

        System.out.println(somme(fractions));
    }

    public static < N extends Nombre< N > > Nombre< N > somme( ArrayList< N > tableau ){
        Nombre< N > resultat = null;
        if(tableau != null && !tableau.isEmpty()) {
            resultat = tableau.get(0);
            for (int i=1; i< tableau.size(); i++) {
                resultat = resultat.add(tableau.get(i));
            }
        }
        return resultat;
    }
}