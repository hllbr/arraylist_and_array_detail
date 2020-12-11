
import java.util.ArrayList;
//Source = Mustafa Murat COŞKUN / UDEMY referans alınarak geliştirilmiştir..

public class Main {
    /*
    bir arrayin boyunu belirledikten sonra bu arrayimizi genişletemiyoruz.
    biz bunu arraylistler kullanarak aşabiliriz.
    */
    public static void yazdır(ArrayList<String> a){
        for(int i = 0;i<a.size();i++){
            System.out.println("Element "+(i+1)+": "+a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();//şuan arraylist oluştu içi boş
        arraylist.add("hllbr");
        arraylist.add("h2lbr");
        arraylist.add("@prince");
        arraylist.add("hl2br");
        arraylist.add("hllbr");
      /*  System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(3));
        //bu arraylistlerin indexlenmesi 
        //arraylistlerin boyunu bulmak için */
        System.out.println("arraylist boyutu : " +arraylist.size());
        for(int i =0;i<arraylist.size();i++){
            System.out.println("arraylistin " +i+" . indeksindeki elemenımız : "+arraylist.get(i));
        }
        //arraylist değer kaldırma 
        arraylist.remove("hl2br");//ya indexsi yada değeri direkt olarak verirsen siler
        System.out.println("ARRAYLİST yeni hali : ");
        System.out.println("arraylist boyutu : " +arraylist.size());
           for(int i =0;i<arraylist.size();i++){
               System.out.println("arraylistin " +i+" . indeksindeki elemenımız : "+arraylist.get(i));
           }
           //arraylist bir elemanın yerini direkt olarak öğrenmek için -->
           System.out.println("aradığın elemanın indexi : " +arraylist.indexOf("hllbr"));
           //2. hllbr yerini bulmak için -->
           System.out.println("sondan aratarak bulmak istediğin elemanın indexi : " +arraylist.lastIndexOf("hllbr"));
           //eğer aradığın değer liste içerisinde mevcut değilse bize -1 değeri yani false ifade döner.
           System.out.println("aradığın elemanın indexi : " +arraylist.indexOf("@prince2"));
           //Arraylist güncellemek için -->
           arraylist.set(3, "muhtar");//indexi ve yeni elemti vermen isteniyor
             System.out.println("yapınızın son hali : ");
        for(int i =0;i<arraylist.size();i++){
            System.out.println("arraylistin " +i+" . indeksindeki elemenımız : "+arraylist.get(i));
            System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/");
            yazdır(arraylist);
        }
    }
}
