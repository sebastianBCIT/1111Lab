//-------------------------------------------------------------------
//4)Given the declarations below, find the result of each expression
//  int a = 3, b = 10, c = 7;
//  double w = 12.9, y = 3.2;
//a)a + b * c   =   a + 70  =   73
//b)a - b - c   =   -7 - c  =   -14
//c)a / b       =   0
//d)b / a       =   3
//e)a - b / c   =   a - 1   =   2
//f)w / y       =   4.03125
//g)y / w       =   0.24806201550387597
//h)a + w / b   =   4.29
//i)a % b / y   =   0.9375
//j)b % a       =   1
//k)w % y       =   0.09999999999999964
//-------------------------------------------------------------------
public class PrelabQ4
{
    public static void main(String[] args)
    {
        int a = 3, b = 10, c = 7;
        double w = 12.9, y = 3.2;
        
        //is there a more elegant way to do these, especially for the
        //calculations that use both int and double?
        
        int resultA = a + b * c;
        System.out.println("a + b * c = " + resultA);
        
        int resultB = a - b - c;
        System.out.println("a - b - c = " + resultB);
        
        int resultC = a / b;
        System.out.println("a / b = " + resultC);
        
        int resultD = b / a;
        System.out.println("b / a = " + resultD);
        
        int resultE = a - b / c;
        System.out.println("a - b / c = " + resultE);
        
        double resultF = w / y;
        System.out.println("w / y = " + resultF);
        
        double resultG = y / w;
        System.out.println("y / w = " + resultG);
        
        double resultH = a + w / b;
        System.out.println("a + w / b = " + resultH);
        
        double resultI = a % b / y;
        System.out.println("a % b / y = " + resultI);
        
        int resultJ = b % a;
        System.out.println("b % a = " + resultJ);
        
        double resultK = w % y;
        System.out.println("w % y = " + resultK);
    }
}
