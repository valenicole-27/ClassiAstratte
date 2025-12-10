public class Triangolo extends Forma {
            int base = 6;
            int altezza = 9;

            @Override
            public void calcolaArea() {
                int area = (base * altezza) / 2;
                System.out.println("Area triangolo:" + area);
            }
        }
