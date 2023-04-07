public class judge {
   public int judge()
   {
        variables naya =new variables();


        if (naya.one==naya.two&&naya.two==naya.three) {
            if(naya.one=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.one=="O") 
            {
                return 2;  //player two wins
            }

            return 0;  //game on
        }

        if (naya.one==naya.five&&naya.five==naya.nine) {
            if(naya.one=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.one=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }

        if (naya.one==naya.four&&naya.four==naya.seven) {
            if(naya.one=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.one=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }

        if (naya.five==naya.two&&naya.five==naya.eight) {
            if(naya.five=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.five=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }


        if (naya.five==naya.four&&naya.five==naya.six) {
            if(naya.five=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.five=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }

        if (naya.five==naya.three&&naya.five==naya.seven) {
            if(naya.five=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.five=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }

        if (naya.nine==naya.eight&&naya.nine==naya.seven) {
            if(naya.nine=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.nine=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }

        if (naya.nine==naya.six&&naya.nine==naya.three) {
            if(naya.nine=="X")
            {
                return 1; //player one wins
            }
            
            if (naya.nine=="O") 
            {
                return 2;  //player two wins
            }
            return 0;  //game on
        }
        if (naya.one!=" "&&naya.two!=" "&&naya.three!=" "&&naya.four!=" "&&naya.five!=" "&&naya.six!=" "&&naya.seven!=" "&&naya.eight!=" "&&naya.nine!=" ") {
            return 3; //draw
        }



        return 0;  //game on
   }
}
