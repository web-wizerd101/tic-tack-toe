import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class player_one_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        variables no=new variables();
        int row;
        int column;
        int go=1;
        
        

        do {
        System.out.print("row: ");
        row=sc.nextInt();
        System.out.print("column: ");
        column=sc.nextInt();
            switch (row) {
                case 1:
                    switch (column) {



                        case 1:
                            if(no.one!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.one="X";
                            }
                            break;



                        case 2:
                        if(no.two!=" ")
                        {
                            System.out.println("place occoupied press value again");
                            go=0;
                        }
                        else
                            {
                                go=1;
                                no.two="X";
                            }
                            break;



                        case 3:
                            if(no.three!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.three="X";
                            }
                            break;



                        default:
                            System.out.println("wrong input press value again ");
                            go=0;
                            break;
                        }
                
                        break;






                case 2:
                    switch (column) {



                        case 1:
                            if(no.four!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.four="X";
                            }
                            break;



                        case 2:
                        if(no.five!=" ")
                        {
                            System.out.println("place occoupied press value again");
                            go=0;
                        }
                        else
                            {
                                go=1;
                                no.five="X";
                            }
                            break;



                        case 3:
                            if(no.six!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.six="X";
                            }
                            break;



                        default:
                            System.out.println("wrong input press value again ");
                            go=0;
                            break;
                    }
                    break;







            
                case 3:
                    switch (column) {



                        case 1:
                            if(no.seven!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.seven="X";
                            }
                            break;



                        case 2:
                        if(no.eight!=" ")
                        {
                            System.out.println("place occoupied press value again");
                            go=0;
                        }
                        else
                            {
                                go=1;
                                no.eight="X";
                            }
                            break;



                        case 3:
                            if(no.nine!=" ")
                            {
                                System.out.println("place occoupied press value again");
                                go=0;
                            }
                            else
                            {
                                go=1;
                                no.nine="X";
                            }
                            break;



                        default:
                            System.out.println("wrong input press value again ");
                            go=0;
                            break;
                    }




                    
                default:
                    System.out.println("wrong input");
                    break;
            }
            
        } while (go==0);

    
    }
}
