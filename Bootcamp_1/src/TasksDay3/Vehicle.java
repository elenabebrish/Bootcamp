package TasksDay3;

public class Vehicle {

        void steering () {
            System.out.println("Steering");

        }

        static void changingGears() {
            System.out.println("Changing gears");
        }

        void havingSpeed () {
            System.out.println("Driving");
        }

        static class Car extends Vehicle { // inherits from the Vehicle class
            boolean red;

            public Car(boolean red) {
                this.red = red;
            }

            @Override
            void steering() {
                System.out.println("Steering 2");
            }
            void havingSpeed () {
                System.out.println("Drive 2");
            }

            static void changingGears() {
                System.out.println("Changing gears 2");
            }
        }

        static class BMW extends Car { //a specific type of Car that inherits from the Car class.
            public BMW() {
                super(true);
            }
            void havingSpeed() {
                System.out.println("BMW speed is xxx");
            }

        }

        public static void main(String[] args) {
            BMW X6 = new BMW();
            X6.steering();
            X6.havingSpeed();
            X6.changingGears();

            Car car = new Car(false);
            car.havingSpeed();
            car.changingGears();

        }
    }

