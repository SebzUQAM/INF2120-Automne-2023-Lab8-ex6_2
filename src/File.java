public class File<T> {
    private Node first;
    private Node last;
    private int laTaille = 0;

    public File() {
    }

    public File(T value) {
        enfiler(value);
    }

    public int taille() {
        return laTaille;
    }

    public boolean estVide() {
        return laTaille == 0;
    }

    public T tete() throws FileVide {
        if(laTaille == 0){
            throw new FileVide();
        }
        return first.valeur;
    }

    public void enfiler(T value) {
        if(estVide()){
            first = new Node(value);
            last = first;
        }else {
            last.droite = new Node(value);
            last = last.droite;
        }
        laTaille++;
    }

    public T defiler() throws FileVide {
        if(estVide()){
            throw new FileVide();
        }
        T resultat = first.valeur;
        first = first.droite;
        laTaille--;
        return resultat;
    }

    private class Node{
        private T valeur;
        private Node droite;

        public Node(T valeur) {
            this.valeur = valeur;
        }
    }
}
