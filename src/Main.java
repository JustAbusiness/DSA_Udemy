import Classes.Cookie;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//   public static void printItems(int a, int b)
//   {
//       for(int i = 0; i < a; i++)
//       {
//           for (int j = 0; j < b; j++) {
//               System.out.println(i + " " + j);
//           }
//       }
//
//   }


    public static void main(String[] args) {
//        Cookie cookieOne = new Cookie("green");
//        Cookie cookieTwo = new Cookie("red");
//
//        // Set Color
//        cookieOne.setColor("blue");
//
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);
     }
}