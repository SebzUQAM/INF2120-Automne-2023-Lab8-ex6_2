public class File<T> {
    // Début de la file
    private Node first;
    // fin de la file
    private Node last;
    // taille de la file qui sera incrémenter ou décrémenter selon
    // l'ajout ou le retrait de data
    private int laTaille = 0;

    // Constructeur de base
    public File() {
    }

    // Constructeur qui ajoute le premier élément
    public File(T value) {
        enfiler(value);
    }

    // retour de la taille
    public int taille() {
        return laTaille;
    }

    // si la file est vide
    public boolean estVide() {
        return laTaille == 0;
    }

    // retourne le premier élément de la file sans le retirer
    public T tete() throws FileVide {
        if(laTaille == 0){
            throw new FileVide();
        }
        return first.valeur;
    }

    // ajouter un élément dans la file
    public void enfiler(T value) {
        if(estVide()){
            // si la file est vide il faut mettre le nouveau noeud
            // à la première possition et la dernière
            first = new Node(value);
            last = first;
        }else {
            // sinon on met le nouveau noeud après (position droite) du dernier noeud
            // et ce noeud devient le dernier noeud
            last.droite = new Node(value);
            last = last.droite;
        }
        // On augmente la taille puisqu'on a un élément de plus
        laTaille++;
    }

    public T defiler() throws FileVide {
        if(estVide()){
            // si la file est vide on ne peut pas retourner quelque chose
            throw new FileVide();
        }
        // on reprend la valeur encapsuler dans le premier noeud
        T resultat = first.valeur;
        // on met le noeud à la droite du premier à la place du premier
        // le garbage collector va prendre l'ancien noeud first, car il n'est
        // plus dans une variable
        first = first.droite;
        // on décremente, car on a un élément de moins
        laTaille--;
        if(estVide()){
            // Si la file est vide alors le dernier élément deviens également null
            last = null;
        }
        // On retourne l'élément qui était dans le premier noeud et non le noeud
        // lui même
        return resultat;
    }

    private class Node{
        // La valeur que le noeud contient
        private T valeur;
        // le noeud qui à été mis apres ce noeud là. Null si ce noeud est le dernier
        private Node droite;

        // le constructeur du noeud, un constructeur pas défaut ici est illogique
        public Node(T valeur) {
            this.valeur = valeur;
        }
    }
}
