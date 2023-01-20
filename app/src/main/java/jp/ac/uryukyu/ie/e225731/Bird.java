package jp.ac.uryukyu.ie.e225731;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class Bird {

    public String name;
    int health = 0;
    int satisfaction = 0;
    ArrayList<String> words = new ArrayList<>();
    public boolean independence = false;

    public Bird(String name){
        this.name = name;
        System.out.println("");  
        System.out.println("ピヨピヨ🦜"+ name + "は嬉しそうに鳴いた");
    }

    public void teach() throws InterruptedException,IOException{
        //出力を遅らせるということは動作を妨げることと同じため、InterruptedExceptionを入れ,例外処理を行う。
        //IOExceptionは入出力の管理

        if(satisfaction <= 100){
            System.out.println( name + "は言葉を覚えたいみたい!");
            Thread.sleep(1000);
            System.out.println("言葉を教えましょう\n→");
            BufferedReader taughtWord = new BufferedReader(new InputStreamReader(System.in));
            String word = taughtWord.readLine();
            words.add(word);
            System.out.println(name+"は"+word+"と嬉しそうに鳴いた");
            Random satPoint = new Random();
            int s = satPoint.nextInt(21) + 1; //満足度ポイントを1から20までの数から、ランダムに出したい
            satisfaction += satisfaction + s;

            if ((health >= 100) && (satisfaction >= 100)){
                Thread.sleep(1000);
                System.out.println(name + "は元気に成長しきった");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                System.out.println("");
                System.out.println(name + "は"+ );
            }
        }
        else(satisfaction >= 100){
            System.out.println( name + "は興味を示していないようだ");
        }


    }

    public void feed() throws InterruptedException{
        System.out.println( name + "は餌を食べたいみたい!");
        Thread.sleep(1000);
        System.out.println("");

    }





    
    
}
