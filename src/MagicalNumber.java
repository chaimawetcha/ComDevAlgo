
public class MagicalNumber {

	public void  displayMagicalNumber(int pImin,int pImax)
    {
        for(int i = pImin; i<=pImax;i++)
        {
            //tester si c'est un multiple de 3:
            if(i%3 == 0)
            {
                System.out.print("H|");
            }
            else if(i%5 == 0)
            {
                System.out.print("S|");
            }
            else {
                System.out.print(i+"|");
            }
        }
    }


	public static void main(String[] args) {
		MagicalNumber m = new MagicalNumber();
		m.displayMagicalNumber(2, 59);
	}
}
