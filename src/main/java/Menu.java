import java.util.Scanner;

public class Menu
{
    // Pour l'exercice 1
    // Tableau MOTS
    static String[][] mots;
    // Il peut y avoir plusieurs mots en commun donc
    // on les stocke dans le tableau ci-dessous
    static String[][] motsCommuns;

    // Pour l'exercice 2
    static int[] tabExo2 = new int[6];

    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        RemplirTableauDesMots();
        do
        {
            do
            {
                System.out.println("1 - Exercice 1");
                System.out.println("2 - Exercice 2");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    // A vous de jouer
                    int i;
                    int j;
                    System.out.println("Quelle est votre modèle?: ");
                    String motsCommuns[] = scanner.nextLine();
                   //ou on peut utiliser tabP.add(tabExo2[i]) .Il faut
                    //faire une boucle qui parcourt chacun des caracteres et
                    //et il faut faire un if:
                    // si il y en a qui correspondent a ceux du modele
                    //alors afficher le mot

                    for(i = 0 ; i < motsCommuns.length;i++){
                        for(j = 0 ; j < motsCommuns.length;j++)
                      if(motsCommuns[i]==mots[i][j] || motsCommuns[i]==?){
                        if(motsCommuns[i]=="a"||motsCommuns[i]=="r" ||motsCommuns[i]=="b"||=="r"||=="e"||=="s"){
                            System.out.println("arbres");
                        }
                          if(motsCommuns[i]=="f"||motsCommuns[i]=="l"||motsCommuns[i]=="e"||=="u"||=="r"||=="s"){
                              System.out.println("fleurs");
                          }
                          if(motsCommuns[i]=="a"||motsCommuns[i]=="m"||motsCommuns[i]=="o"||motsCommuns[i]=="u"||motsCommuns[i]=="r"||motsCommuns[i]=="s"){
                              System.out.println("amours");
                          }
                          if(motsCommuns[i]=="r"||motsCommuns[i]=="o"||motsCommuns[i]=="u"||motsCommuns[i]=="l"||motsCommuns[i]=="e"||motsCommuns[i]=="r"){
                              System.out.println("rouler");
                          }if(motsCommuns[i]=="m"||motsCommuns[i]=="a"||motsCommuns[i]=="n"||motsCommuns[i]=="g"||motsCommuns[i]=="e"||motsCommuns[i]==""){
                              System.out.println("manger");
                          }
                          if(motsCommuns[i]=="v"||motsCommuns[i]=="a"||motsCommuns[i]=="c"||motsCommuns[i]=="h"||motsCommuns[i]=="e"||motsCommuns[i]=="s"){
                              System.out.println("vaches");
                          }
                      }else{
                         System.out.println("Aucun mot trouvé");
                        }
                    }


                    break;
                case 2:
                    // A vous de jouer Je decide de créer plusieurs variables et plusieurs boucles
                    //mais je fais attention a ne pas les imbriquer les unes dans les autres
                    //ce qui donnerait un tout autre résultat non exigé.
                    int[] tabExo2=new int[6];
                    //int i
                    //int j;
                    int k;
                    int l;
                    int m;
                    for(i = 0 ; i < tabExo2.length;i++){
                       System.out.println(tabExo2[i]);
                    }
                       for(j = 0 ; j < tabExo2.length;j++){
                           tabExo2[j]=tabExo2[i]+tabExo2[i+1];
                           System.out.println(tabExo2[j]);
                       }
                    for(k = 0 ; k < j;k++){
                        tabExo2[k]=tabExo2[j]+tabExo2[j+1];
                        System.out.println(tabExo2[k]);
                    }
                    for(l = 0 ; i < tabExo2.length;i++){
                        tabExo2[l]=tabExo2[k]+tabExo2[k+1];
                        System.out.println(tabExo2[l]);
                    }
                    for(m = 0 ; m < tabExo2.length;i++){
                        tabExo2[m]=tabExo2[l]+tabExo2[l+1];
                        System.out.println(tabExo2[m]);
                    }
                       break;
            }
        }while (choix != 0);
    }

    public static void RemplirTableauDesMots()
    {
        // Exercice n°1
        mots = new String[6][6];
        motsCommuns = new String[6][6];
        // Ne pas effacer et ne pas toucher le code ci-dessous
        // Voici un jeu d'essai pour le tableau MOTS
        // Dans ce tableau on trouve les mots suivants :
        // arbres ; fleurs ; amours ; rouler ; manger ; vaches
        mots[0][0] = "a";mots[0][1] = "r";mots[0][2] = "b";mots[0][3] = "r";mots[0][4] = "e";mots[0][5] = "s";
        mots[1][0] = "f";mots[1][1] = "l";mots[1][2] = "e";mots[1][3] = "u";mots[1][4] = "r";mots[1][5] = "s";
        mots[2][0] = "a";mots[2][1] = "m";mots[2][2] = "o";mots[2][3] = "u";mots[2][4] = "r";mots[2][5] = "s";
        mots[3][0] = "r";mots[3][1] = "o";mots[3][2] = "u";mots[3][3] = "l";mots[3][4] = "e";mots[3][5] = "r";
        mots[4][0] = "m";mots[4][1] = "a";mots[4][2] = "n";mots[4][3] = "g";mots[4][4] = "e";mots[4][5] = "r";
        mots[5][0] = "v";mots[5][1] = "a";mots[5][2] = "c";mots[5][3] = "h";mots[5][4] = "e";mots[5][5] = "s";

        // Exercice n°2
        tabExo2[0] = 0;
        tabExo2[1] = 1;
        tabExo2[2] = 2;
        tabExo2[3] = 3;
        tabExo2[4] = 4;
        tabExo2[5] = 5;
    }
}
