package com.skillstorm.CarRental;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CarRentalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarRentalBusiness myBusiness;
		Queue<Customer> line = new LinkedList<>();
		Car car1 = new Car("Kia Niro", 2017, CarType.HYBRID, 200);
		Car car2 = new Car("Toyota Prius", 2016, CarType.HYBRID, 100);
		Car car3 = new Car("Nissan Leaf", 2019, CarType.HYBRID, 150);
		LinkedList<Car> carList = new LinkedList<>();
		HashMap<CarType, LinkedList<Car>> inventory = new HashMap<>();
		Customer customer1 = new Customer("John", 
										 LocalDateTime.of(1995, 6, 26, 5, 15), 
										 CustomerType.PICKING_UP_CAR, 
										 CarType.HYBRID, 
										 null,
										 sc);
		Customer customer2 = new Customer("John", 
				 						  LocalDateTime.of(2000, 6, 26, 5, 15), 
				 						  CustomerType.PICKING_UP_CAR, 
				 						  CarType.HYBRID, 
				 						  null,
				 						  sc);
		Customer customer3 = new Customer("John", 
				  						  LocalDateTime.of(1995, 6, 26, 5, 15), 
				  						  CustomerType.RETURNING_CAR, 
				  						  CarType.HYBRID, 
				  						  car3,
				  						  sc);
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		inventory.put(car1.getType(), carList);
		line.offer(customer1);
		line.offer(customer2);
		line.offer(customer3);
		myBusiness = new CarRentalBusiness(inventory, line, 0, 100);
		myBusiness.helpNextCustomer();
		myBusiness.helpNextCustomer();
		myBusiness.helpNextCustomer();
		System.out.println(myBusiness.getInventory());
		System.out.println(myBusiness.getMoneyEarned());
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		sc.close();
	}
}
