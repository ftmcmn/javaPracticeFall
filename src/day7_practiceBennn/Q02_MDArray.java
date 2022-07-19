package day7_practiceBennn;

import java.util.Arrays;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {

        String arr[][]={{"$12" , "$22" , "0$"},  {"€9" , "€40" , "$1" }, {"€12", "$2","$0"}};

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains("$")){

                    arr[i][j]=  arr[i][j].replace("$","");
                    double in=Double.valueOf(arr[i][j]);
                    in*=3.2;
                    arr[i][j]="$"+in;

                }else if (arr[i][j].contains("€")){

                    arr[i][j]=  arr[i][j].replace("€","");
                    double in=Double.valueOf(arr[i][j]);
                    in*=4.2;
                    arr[i][j]="€"+in;

                }

            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
}
