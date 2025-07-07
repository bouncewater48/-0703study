package setTest;

import java.util.HashSet;
import java.util.Random;

public class LottoSet02 {
   public static void main(String[] args) {
//      Random r = new Random();
//      System.out.println(r.nextInt(10) + 1);
      printLotto(5);
      
   }
   
   static void printLotto(int num) {
      Random r = new Random();
      HashSet<Integer> lottoNum = new HashSet<>();
//      ArrayList<Integer> lottoNum = new ArrayList<>();
      for(int i = 0; i < num; i++) {
          while(lottoNum.size() < 7) {
             lottoNum.add(r.nextInt(45) + 1);
          }
       }
       System.out.println(lottoNum);
    }
 }
