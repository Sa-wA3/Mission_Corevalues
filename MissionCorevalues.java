import java.util.Scanner;
import java.util.Random;

public class MissionCorevalues {
    static void test(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("参加人数を教えてください："); int memberNum = sc.nextInt();
        String[] members = new String[memberNum];

        //membersに格納→並び替え
        System.out.print("参加する方の名前を入力してください（スペース区切りでお願いします）：");
        for (int i = 0; i < members.length; i++) {
            members[i] = sc.next();
        }
        for (int i = 0; i < members.length; i++) {
            int r =rand.nextInt(memberNum);
            String tmp = members[i];
            members[i] = members[r];
            members[r] = tmp;
        }
        //ここまで

        test(500);

        System.out.println("感謝の朝礼を始めます。"); //あいさつ

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // output Output the part of the reading
        Date date = new Date(); // call outputRole Method from Date Class
        date.outputRole();
        // end

        test(500);

        //以下、発表までの待ち時間っぽい処理
        System.out.println("順番を発表します！");
        for (int i = 1; i <= memberNum; i++) {
            test(500);
            if (i != memberNum) {
                System.out.print("# ");    
            }else {
                System.out.println("#");
            }
            
        }
        //ここまで

        //以下、読み上げる順番を表示する処理
        for (int i = 0; i < memberNum; i++) {
            test(250);
            System.out.println((i + 1) + "番目：" + members[i] + "さん");
        }
        //ここまで

        System.out.println("では、1番目の" + members[0] + "さんから、よろしくお願いいたします！");
        sc.close();
    }
}