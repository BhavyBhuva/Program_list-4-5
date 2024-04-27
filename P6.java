// Bhavy Bhuva
// 220130318038
/*Write a program that executes two threads. One thread will print the even numbers and another thread will print odd numbers from 1 to 50 */
class even extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            if(i % 2 == 0)
            {
                System.out.println("Even number " + i );
            }
        }
            
    }
}

class odd extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
            if(i % 2 != 0)
            {
                System.out.println("odd number " + i );
            }
        }
            
    }
}
public class P6 {
    public static void main(String[] args){
        even e1 = new even();
        odd o1 = new odd();
        e1.run();
        o1.run();
    }
}

