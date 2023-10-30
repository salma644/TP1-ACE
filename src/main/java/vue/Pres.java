package vue;

import data.IData;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres {
    private IMetier metier;
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*IData data=new DataImpl2();
        MetierImpl metier1=new MetierImpl();

        metier1.setData(data);
        System.out.println(metier1.calcul());*/


        //IData dao =new DataImpl();
        Scanner sc = new Scanner(System.in);
        System.out.print("entrer la class Data: ");
        String dataClassName=sc.nextLine();
        System.out.print("entrer la class metier: ");
        String metierClassName=sc.nextLine();

      /*  int count = 0;
        Scanner scanner =new Scanner(new File("src/main/config.txt"));
        while (scanner.hasNext()){
            if (count==0){
                System.out.println(dataClassName);
                dataClassName=scanner.nextLine();
                count++;
            }else{
                System.out.println(metierClassName);
                metierClassName=scanner.nextLine();
            }
        }*/

        Class cData =Class.forName(dataClassName);
        Class cMetier =Class.forName(metierClassName); //toute les classes sont chargee
        //en memoire sous forme d'un objet de type class
        IData data=(IData)cData.getConstructor().newInstance();
        MetierImpl metier= (MetierImpl) cMetier.getConstructor().newInstance();//=> new DataImpl
        metier.setData(data);
         System.out.println(metier.calcul());
    }
}
