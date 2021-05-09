package pl.gda.wsb;

import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.util.Objects;

public class Human {
    String name;
    String surname;
    public Animal pet;
    public Car car;
    public Phone phone;
    public Double cash;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.value)
        {
            System.out.println("Kupiono samochod za gotowke");
            this.car = car;
        }else if(salary > car.value/12)
        {
            System.out.println("Kupiono samochod w kredycie");
        }else System.out.println("Nie stac Cie na ten samochod");
    }

    private Double salary;
    public void getSalary()
    {
        System.out.println(LocalDateTime.now());
    }
    public void setSalary(Double value)
    {
        if(value <0)
        {
            System.out.println("Wartosc nie moze byc ujemna");
        }else {
            System.out.println("Dane wyslane do ksiegowosci");
            System.out.println("Dane wyslane do Hanny z kadr");
            System.out.println("Dane wyslane do ZUS i US");
            this.salary = value;
        }
    }


    public Human(String name, String surname, Double salary, Double cash) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, pet, car);
    }
}
