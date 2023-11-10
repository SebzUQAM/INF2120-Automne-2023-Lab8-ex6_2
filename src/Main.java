// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File<Integer> file = new File<>(1);
        file.enfiler(2);
        file.enfiler(3);
        file.enfiler(4);
        file.enfiler(5);
        file.enfiler(6);
        file.enfiler(7);
        file.enfiler(8);

        System.out.println();
        while (!file.estVide()){
            try {
                System.out.println(file.defiler());
            }catch (FileVide e){}
        }

        file.enfiler(5);
        file.enfiler(6);
        file.enfiler(7);
        file.enfiler(8);
        file.enfiler(9);
        file.enfiler(10);
        file.enfiler(11);

        System.out.println();
        while (!file.estVide()){
            try {
                System.out.println(file.defiler());
            }catch (FileVide e){}
        }

        file.enfiler(1);
        file.enfiler(2);
        file.enfiler(3);
        file.enfiler(4);
        file.enfiler(5);
        file.enfiler(6);

        System.out.println();
        try {
            System.out.println(file.defiler());
            System.out.println(file.defiler());
        }catch (FileVide e){}

        file.enfiler(7);
        file.enfiler(8);
        file.enfiler(9);
        file.enfiler(10);


        System.out.println();
        while (!file.estVide()){
            try {
                System.out.println(file.defiler());
            }catch (FileVide e){}
        }
    }
}