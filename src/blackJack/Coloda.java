package blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Coloda implements IColoda{
    private Card[] cards = new Card[52];

    public Coloda() {
        cards[0] = new Card("Двойка пика", 2);
        cards[1] = new Card("Двойка трефа", 2);
        cards[2] = new Card("Двойка бубна", 2);
        cards[3] = new Card("Двойка черви", 2);

        cards[4] = new Card("Тройка пика", 3);
        cards[5] = new Card("Тройка трефа", 3);
        cards[6] = new Card("Тройка бубна", 3);
        cards[7] = new Card("Тройка черви", 3);

        cards[8] = new Card("Четверка пика", 4);
        cards[9] = new Card("Четверка трефа", 4);
        cards[10] = new Card("Четверка бубна", 4);
        cards[11] = new Card("Четверка черви", 4);

        cards[12] = new Card("Пять пикa", 5);
        cards[13] = new Card("Пять трефa", 5);
        cards[14] = new Card("Пять бубна", 5);
        cards[15] = new Card("Пять черви", 5);

        cards[16] = new Card("Шесть пика", 6);
        cards[17] = new Card("Шесть трефа", 6);
        cards[18] = new Card("Шесть бубна", 6);
        cards[19] = new Card("Шесть черви", 6);

        cards[20] = new Card("Семь пика", 7);
        cards[21] = new Card("Семь трефа", 7);
        cards[22] = new Card("Семь бубна", 7);
        cards[23] = new Card("Семь черви", 7);

        cards[24] = new Card("Восемь пика", 8);
        cards[25] = new Card("Восемь трефа", 8);
        cards[26] = new Card("Восемь бубна", 8);
        cards[27] = new Card("Восемь черви", 8);

        cards[28] = new Card("Девять пика", 9);
        cards[29] = new Card("Девять трефа", 9);
        cards[30] = new Card("Девять бубна", 9);
        cards[31] = new Card("Девять черви", 9);

        cards[32] = new Card("Десять пика", 10);
        cards[33] = new Card("Десять трефа", 10);
        cards[34] = new Card("Десять бубна", 10);
        cards[35] = new Card("Десять черви", 10);

        cards[36] = new Card("Туз пика", 11);
        cards[37] = new Card("Туз трефа", 11);
        cards[38] = new Card("Туз бубна", 11);
        cards[39] = new Card("Туз черви", 11);

        cards[40] = new Card("Дама пика", 3);
        cards[41] = new Card("Дама трефа", 3);
        cards[42] = new Card("Дама бубна", 3);
        cards[43] = new Card("Дама черви", 3);

        cards[44] = new Card("Валет пика", 2);
        cards[45] = new Card("Валет трефа", 2);
        cards[46] = new Card("Валет бубна", 2);
        cards[47] = new Card("Валет черви", 2);

        cards[48] = new Card("Король пика", 4);
        cards[49] = new Card("Король трефа", 4);
        cards[50] = new Card("Король бубна", 4);
        cards[51] = new Card("Король черви", 4);
    }

    //возвращается карта -обращаемся к колоде Пишем метод
    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
//рендомно вытягиваем карту 0 - это мин индекс
        return cards[randomNum];
//возвращаем ячейку под randomNum
    }

}


