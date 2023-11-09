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
        return first.getValeur();
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
        T resultat = first.valeur;
        return null;
    }

    private class Node{
        private T valeur;
        private Node droite;

        public Node(T valeur) {
            this.valeur = valeur;
        }

        public T getValeur() {
            return valeur;
        }

        public Node getDroite() {
            return droite;
        }

        public void setDroite(Node droite) {
            this.droite = droite;
        }
    }
}
