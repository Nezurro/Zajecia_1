package devices;

import Creatures.Human;
import pl.gda.wsb.sellable;

public abstract class Device implements sellable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    protected Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void TurnOn();
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.phone != null)
        {
            System.out.println(seller.toString()+ " Posiada Telefon");
            if(buyer.cash >= price)
            {
                buyer.cash -= price;
                seller.cash += price;
                buyer.phone = seller.phone;
                seller.phone = null;

                System.out.println("Transakcja została przeprowadzona pomyślnie." + buyer.toString() + " kupił telefon od: " + seller.toString());
            }else System.out.println("Kupujacy nie posiada tyle gotówki");
        }else if(seller.car !=null)
        {
            System.out.println(seller.toString()+ " Posiada Samochod");
            if(buyer.cash >= price)
            {
                buyer.cash -= price;
                seller.cash += price;
                buyer.car = seller.car;
                seller.car = null;

                System.out.println("Transakcja została przeprowadzona pomyślnie." + buyer.toString() + " kupił samochód od: " + seller.toString());
            }else System.out.println("Kupujacy nie posiada tyle gotówki");
        }
    };
}
