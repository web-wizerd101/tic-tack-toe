import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        scores ssc=new scores();
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to our Tic Tac Toe game! We're thrilled to have you here\nand can't wait for you to experience the thrill of this classic game.");
        
        int a=0;
        int swiitch;
        do {
            String player_one;
            String player_two;

            System.out.println("enter the name of player one ");
            player_one=sc.nextLine();
            System.out.println("enter the name of player two ");
            player_two=sc.nextLine();
        
            do {
                variables ko=new variables();
                ko.renew();
                do {
                    
                    show s =new show();
                    s.main(args);
    
                    player_one_input po =new player_one_input();
                    System.out.println(player_one+" puts the 'X' at ");
                    po.main(args);
    
                
                    s.main(args);
    
                    judge jg=new judge();
                    a=jg.judge();
                    if (a==1) {
                        System.out.println(player_one+" wins");
                        break;
                    }
                    if (a==2) {
                        System.out.println(player_two+" wins");
                        break;
                    }
                    if (a==3) {
                        System.out.println("it is a draw");
                        break;
                    }
    
                    player_two_input pt =new player_two_input();
                    System.out.println(player_two+" puts the 'O' at ");
                    pt.main(args);
                    
                    s.main(args);
    
                    a=jg.judge();
                    if (a==1) {
                        System.out.println(player_one+" wins");
                        ssc.increment(a);
                        ssc.show_scores(player_one, player_two);
                        break;
                    }
                    if (a==2) {
                        System.out.println(player_two+" wins");
                        ssc.increment(a);
                        ssc.show_scores(player_one, player_two);
                        break;
                    }
                    if (a==3) {
                        System.out.println("it is a draw");
                        ssc.increment(a);
                        ssc.show_scores(player_one, player_two);
                        break;
                    }
                } while (a==0||a==3);
                System.out.println("\nPlay again: 1\nScore reset: 2\nname change: 3\nexit: 0");
                swiitch=sc.nextInt();
                if (swiitch==2) {
                    ssc.reset();
                }
            } while (swiitch==1||swiitch==2);
        ssc.reset();
        } while (swiitch==3);

        
        

    }
}
