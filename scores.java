public class scores {
    static int player_one_score=0;
    static int player_teo_score=0;

void show_scores(String one,String two)
{
    
    System.out.println("Scores");
    System.out.println(one+" :"+player_one_score);
    System.out.println(two+" :"+player_teo_score);
}
void increment(int a)
{
    switch (a) {
        case 1:
            player_one_score+=2;
            break;

        case 2:
            player_teo_score+=2;
            break;

        case 3:
            player_one_score++;
            player_teo_score++;
            break;

    
        default:
            break;
    }
}

void reset()
{
    player_one_score=0;
    player_teo_score=0;
}
}
