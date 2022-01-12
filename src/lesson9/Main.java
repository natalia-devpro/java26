package lesson9;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Владимир Малявин",3, "Конфуций",1992,"Молодая гвардия");
        Book book2 = new Book("В.Я.Сидихменов", 20, "Манчжурские правители Китая", 1985, "Наука");
        Book book3 = new Book("ал-Масуди", 7, "Золотые копи и россыпи самоцветов", 2002, "Наталис");

        Journal magazin1 = new Journal(1, "Наука и жизнь", 2021,"Знание", 23);
        Journal magazin2 = new Journal(2, "Наука и жизнь", 2021, "Знание", 45);


        PrintPubl[] printPubl = new PrintPubl[5];
        printPubl[0] = book1;
        printPubl[1] = book2;
        printPubl[2] = book3;
        printPubl[3] = magazin1;
        printPubl[4] = magazin2;
        printFatBook(printPubl);
    }

    public static void printFatPubl(PrintPubl[] printPubl){
        PrintPubl theFatPubl = printPubl[0];
        for(PrintPubl publ:printPubl){
            if(publ.getPages() > theFatPubl.getPages()){
                theFatPubl = publ;
            }
        }
        System.out.println(theFatPubl);

    }

    public static void printFatBook(PrintPubl[] printPubl){
        PrintPubl theFatPubl = null;
        for(PrintPubl publ:printPubl){
            if(publ instanceof Book){
                if(theFatPubl == null){
                    theFatPubl = publ;
                }else {
                    if(publ.getPages() > theFatPubl.getPages()){
                        theFatPubl = publ;
                    }
                }
            }
        }
        System.out.println(theFatPubl);

    }

}
