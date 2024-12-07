package InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Create a Car object
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);

        Truck truck = new Truck();
        truck.setName("Hauler");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(5000);

        session.save(car);
        session.save(truck);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully into the database!");
    }
}
