import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public enum VehicleStatus {
	FREE,
	BUSY,
	NOT_WORKING;
}
public enum OrderPriority {
	LOW,
	MEDIUM,
	HIGH;
}
public enum OrderStatus {
	DELIVERED,
	PROCESSING,
	CANCELLED;
}
public enum PaymentMode {

	NET_BANKING,
	CREDIT_CARD,
	DEBIT_CARD;
}
public enum PaymentStatus {
	PAID,
	UNPAID;
}

class User {

	private int userId;
	private String name;
	private Location address;
	private String mobNo;
	private String emailId;

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Location getAddress()
	{
		return address;
	}

	public void setAddress(Location address)
	{
		this.address = address;
	}

	public String getMobNo()
	{
		return mobNo;
	}

	public void setMobNo(String mobNo)
	{
		this.mobNo = mobNo;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
}
 class Item {

	private String name;
	private int price;
	private int volume;
	private int weight;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public int getVolume()
	{
		return volume;
	}

	public void setVolume(int volume)
	{
		this.volume = volume;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}
 class Location {

	private Double longitude;
	private Double latitude;

	public Double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}

	public Double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}
}
 class Vehicle {

	private int id;
	private String vehicleNo;
	private int capacity;
	private Location currentPosition;
	private VehicleStatus currentStatus;

	public Vehicle(int id, String vehicleNo, int capacity)
	{
		this.id = id;
		this.vehicleNo = vehicleNo;
		this.capacity = capacity;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getVehicleNo()
	{
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo)
	{
		this.vehicleNo = vehicleNo;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	public Location getCurrentPosition()
	{
		return currentPosition;
	}

	public void setCurrentPosition(Location currentPosition)
	{
		this.currentPosition = currentPosition;
	}

	public VehicleStatus getCurrentStatus()
	{
		return currentStatus;
	}

	public void setCurrentStatus(VehicleStatus currentStatus)
	{
		this.currentStatus = currentStatus;
	}
}
 class Bike extends Vehicle {

	private final static int capacityofBike = 10;

	public Bike(int id, String vehicleNo)
	{

		super(id, vehicleNo, capacityofBike);
	}
}
 class Truck extends Vehicle {

	private final static int capacityofTruck = 100;

	public Truck(int id, String vehicleNo)
	{
		super(id, vehicleNo, capacityofTruck);
	}
}
 class PaymentDetails {
	private PaymentMode paymentMode;
	private String transactionId;
	private int amount;
	private PaymentStatus paymentStatus;
	private String cardNumber;

	public PaymentMode getPaymentMode()
	{
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode)
	{
		this.paymentMode = paymentMode;
	}

	public String getTransactionId()
	{
		return transactionId;
	}

	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	public PaymentStatus getPaymentStatus()
	{
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus)
	{
		this.paymentStatus = paymentStatus;
	}

	public String getCardNumber()
	{
		return cardNumber;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}
}

 class Order {

	private int orderId;
	private OrderPriority priority_of_order;
	private User sender;
	private Location destination;
	private PaymentDetails paymentDetails;
	private List<Item> items;
	private Long totalWeight;
	private OrderStatus currentStatus;
	private Date timeOfOrderPlaced;
	private Date timeOfOrderDelivery;
	private Vehicle vehicleOfThisOrder;

	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public OrderPriority getPriority_of_order()
	{
		return priority_of_order;
	}

	public void setPriority_of_order(OrderPriority priority_of_order)
	{
		this.priority_of_order = priority_of_order;
	}

	public User getSender()
	{
		return sender;
	}

	public void setSender(User sender)
	{
		this.sender = sender;
	}

	public Location getDestination()
	{
		return destination;
	}

	public void setDestination(Location destination)
	{
		this.destination = destination;
	}

	public PaymentDetails getPaymentDetails()
	{
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails)
	{
		this.paymentDetails = paymentDetails;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}

	public Long getTotalWeight()
	{
		return totalWeight;
	}

	public void setTotalWeight(Long totalWeight)
	{
		this.totalWeight = totalWeight;
	}

	public OrderStatus getCurrentStatus()
	{
		return currentStatus;
	}

	public void setCurrentStatus(OrderStatus currentStatus)
	{
		this.currentStatus = currentStatus;
	}

	public Date getTimeOfOrderPlaced()
	{
		return timeOfOrderPlaced;
	}

	public void setTimeOfOrderPlaced(Date timeOfOrderPlaced)
	{
		this.timeOfOrderPlaced = timeOfOrderPlaced;
	}

	public Date getTimeOfOrderDelivery()
	{
		return timeOfOrderDelivery;
	}

	public void setTimeOfOrderDelivery(Date timeOfOrderDelivery)
	{
		this.timeOfOrderDelivery = timeOfOrderDelivery;
	}

	public Vehicle getVehicleOfThisOrder()
	{
		return vehicleOfThisOrder;
	}

	public void setVehicleOfThisOrder(Vehicle vehicleOfThisOrder)
	{
		this.vehicleOfThisOrder = vehicleOfThisOrder;
	}
}

public  class LogisticsSystem {

	private List<Order> orders;
	private List<Vehicle> vehicles;
	private List<User> users;

	public LogisticsSystem()
	{
		this.orders = new ArrayList<Order>();
		this.vehicles = new ArrayList<Vehicle>();
		this.users = new ArrayList<User>();
	}

	public void takeAnOrder(Order order)
	{
		System.out.println("Adding an order to the system");
		orders.add(order);
	}

	public void processOrder(Order order)
	{
		System.out.println("Processing an order of the system");
	}

	public Location trackOrder(int orderId)
	{
		System.out.println("Tracking an order of the system");
		Location location = null;
		// location = findLocationOfGivenOrder();
		return location;
	}

	public void cacelOrder(Order order)
	{
		System.out.println("Going to cancell an order of the system");
	}

	public void registerNewUser(User user)
	{
		System.out.println("Registering a new user to the system");
		users.add(user);
	}

	public List<Order> getOrders()
	{
		return orders;
	}

	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}

	public List<Vehicle> getVehicles()
	{
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles)
	{
		this.vehicles = vehicles;
	}

	public List<User> getUsers()
	{
		return users;
	}

	public void setUsers(List<User> users)
	{
		this.users = users;
	}
}
