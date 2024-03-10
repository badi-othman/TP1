package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scan = new Scanner(new File("config.txt")); //scanner that will read our config file

        String daoClassName = scan.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String classMetierName = scan.nextLine();
        Class cMetier = Class.forName(classMetierName);
        IMetier metier =(IMetier) cMetier.newInstance();
    }
}
