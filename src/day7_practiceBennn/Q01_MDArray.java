package day7_practiceBennn;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {

        int arr[][]={{1,2,3},{2,3,1},{5,5,5},{2,1,3}};

        int enKucuk=100;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]<enKucuk){
                    enKucuk=arr[i][j];
                }

            }

        }
        System.out.println(enKucuk);
    }
}
