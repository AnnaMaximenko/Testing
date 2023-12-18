package seminar2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task1.Calculator;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car newCar;
    private Motorcycle newMotorcycle;

    @BeforeEach
    void setUp() {
         newCar=new Car("BMW", "X6", 2022);
         newMotorcycle=new Motorcycle("Kawasaki", "H2R", 2010);
    }

    @AfterEach
    void tearDown() {
        newCar = null;
        newMotorcycle=null;
    }

// Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Тест метода Car также является экземпляром ТС")
    void testCarIsInstanceOfVehicle(){
//        newCar=new Car("BMW", "X6", 2022);
        assertTrue(newCar instanceof Vehicle);}

//    Проверка того, объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Машина создается с 4-мя колесами")
    void WheelsCar() {
        assertEquals(newCar.getNumWheels(),4);
    }

//    проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Велосипед создается с 2-мя колесами")
    void WheelsMotorcycle() {
        assertEquals(newMotorcycle.getNumWheels(),2);
    }

//    проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    @DisplayName("Car развивает скорость 60")
    void  testCarSpeedByModeTestDrive(){
        newCar.testDrive();
        assertEquals(newCar.getSpeed(),60);
    }

//    проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
@Test
@DisplayName("Motorcycle развивает скорость 75")
void  testMotorcycleSpeedByModeTestDrive(){
    newMotorcycle.testDrive();
    assertEquals(newMotorcycle.getSpeed(),75);
}

//    проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
@Test
@DisplayName("Car в режиме парковки машина останавливается")
void  testCarSpeedByPark(){
        newCar.testDrive();
        newCar.park();
        assertEquals(newCar.getSpeed(),0);
}

//    проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
@Test
@DisplayName("Motorcycle в режиме парковки машина останавливается")
void  testMotorcycleSpeedByPark(){
    newMotorcycle.testDrive();
    newMotorcycle.park();
    assertEquals(newMotorcycle.getSpeed(),0);
}


}



