public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise return 1 for win.
    public int play ( ) {
        r.roll();
        int roll1 = r.total();
        if (roll1 == 2 || roll1 == 3 || roll1 == 12){
            return 0;
        }
        else if (roll1 == 7 || roll1 == 11){
            return 1;
        }
        else{
         int point = roll1;
         r.roll();
         roll1 = r.total();
         while(roll1 != 7){
            if(roll1 == point){
                return 1;
            }
            else{
                r.roll();
                roll1 = r.total();
            }
         }
         return 0;
            }
        }
    
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
        int x;
        x = 0;
        while(x < howMany){
            if(this.play() == 1){
                //needs writing
            }
            x++;
        }
    }
    }

