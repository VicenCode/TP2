/* INSCRIVEZ VOTRE OU VOS NOMS ICI:

NE MODIFIEZ PAS CE FICHIER (sauf pour mettre certaines sections en commentaire le temps de tester votre code) */

public class Main {
    public static void main(String[] args) {
        commencerTest("Ajout de mots et de lettres");
        Mot merci = new Mot("Merci"), prince = new Mot("prince");
        Phrase chaine1 = new Phrase();
        chaine1.ajouter(merci);
        chaine1.ajouter(prince);
        chaine1.ajouter('s');
        chaine1.ajouter('s');
        chaine1.ajouter('e');
        System.out.println(chaine1);
        System.out.printf("%d mots, %d caractères\n", chaine1.getNbMots(), chaine1.getLongueur());

        commencerTest("Insertion de mots et de lettres");
        Phrase chaine2 = new Phrase("et un");
        Mot an = new Mot("an");
        chaine2.inserer(an, 1);
        chaine2.inserer('s', 0, 1);
        chaine2.inserer('d', 1, 0);
        chaine2.inserer('s', 1, 3);
        System.out.println(chaine2);
        System.out.printf("%d mots, %d caractères\n", chaine2.getNbMots(), chaine2.getLongueur());

        commencerTest("Insertions mixtes");
        Phrase chaine3 = new Phrase();
        chaine3.ajouter("mais");
        chaine3.inserer(chaine1, 0);
        chaine3.inserer(',', 1, 9);
        chaine3.inserer("autre", 1);
        chaine3.inserer("Mari", 4);
        chaine3.ajouter('o');
        chaine3.ajouter(' ');
        chaine3.ajouter('s');
        chaine3.ajouter('t');
        chaine3.inserer('e', 5, 0);
        chaine3.ajouter("où?");
        System.out.println(chaine3);
        System.out.printf("%d mots, %d caractères\n", chaine3.getNbMots(), chaine3.getLongueur());

        commencerTest("Validation de getMot() et getLettre()");
        Phrase chaine4 = new Phrase(chaine3.toString());
        System.out.print(chaine3.getMot(0));
        System.out.print(chaine3.getMot(2));
        System.out.println(chaine3.getMot(5));

        System.out.print(chaine3.getLettre(1, 0) + " ");
        System.out.print(chaine3.getLettre(1, 2) + " ");
        System.out.println(chaine3.getLettre(1, 4));

        System.out.print(chaine3.getLettre(0) + " ");
        System.out.print(chaine3.getLettre(12) + " ");
        System.out.println(chaine3.getLettre(40));

        commencerTest("Test des insertions invalides");
        Mot chateau = new Mot("château");
        System.out.print(chateau.inserer('X', -1) + " ");
        System.out.print(chateau.inserer('Y', 10) + " ");
        System.out.println(chateau);

        Phrase chaine5 = new Phrase(chaine3.toString());
        System.out.print(chaine5.inserer(chateau, -5) + " ");
        System.out.print(chaine5.inserer(chaine2, 10) + " ");
        System.out.println(chaine5.inserer('Z', 1, 15));
        System.out.println(chaine5);
        System.out.printf("%d mots, %d caractères\n", chaine5.getNbMots(), chaine5.getLongueur());

        commencerTest("Validation intégratice");
        Phrase chaine6 = new Phrase(chaine5.getMot(0).toString());
        chaine6.inserer(chaine3.getMot(4).toString(), 1);
        chaine6.ajouter(',');
        chaine6.ajouter(chaine2);
        chaine6.inserer("mais la princesse", 2);
        chaine6.ajouter(chateau);
        chaine6.ajouter('!');
        chaine6.inserer("autre", chaine6.getNbMots() - 1);
        System.out.println(chaine6);
        System.out.printf("%d mots, %d caractères\n", chaine6.getNbMots(), chaine6.getLongueur());
    }

    private static int noTest = 0;
    private static void commencerTest(String description) {
        System.out.printf("\n=== Test #%d : %s ===\n", ++noTest, description);
    }
}
