public class operaters {
    public static void main(String[] args)
    {
        int willekeurig = (int) Math.ceil  (Math.random() *10 );
        String stukietekst = "dat kan!";

        switch (stukietekst)
        {
            case "leuk":
                System.out.println("wat geinig");
            break;
            case "skeer.....":
                System.out.println("ja man...");
            case "Raar": case "dat kan!":
                System.out.println("dit kan in beide gevallen");
                break;
        }

        System.out.println("getal " + willekeurig);
        if (willekeurig >= 8)
        {
            System.out.println("zoveel als dat een octopus armen heeft of groter");
        }

       else if (willekeurig == 7)
        {
            System.out.println("exact 7");
        }
        else if (willekeurig <=6 && willekeurig >= 4)
        {
            System.out.println("een getal van 4 tot 6");
        }

        else
        {
            System.out.println("het is iets anders!");
        }
        if (willekeurig == 1 || willekeurig ==3)
        {
            System.out.println("het getal is 1 of 3");
        }

        System.out.println("einde programma");



    }



}
