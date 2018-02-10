public class Experiment{

        public static void main(String[] argv)
        {
            int tal = 0;
            int summa = 0;

            for(tal = 1; tal < 1000; tal++)
            {
                if(tal%3 == 0)
                {
                    summa += tal;
                    continue;
                }
                else if (tal%5 == 0)
                {
                    summa += tal;
                }
            }
            System.out.println(summa);
        }

}