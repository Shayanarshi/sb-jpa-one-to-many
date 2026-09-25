package in.ashokit.runner;

import in.ashokit.model.Customer;
import in.ashokit.model.Order;
import in.ashokit.repository.CustomerRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class MyApplicationRunner implements ApplicationRunner {


    @Autowired
    CustomerRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

//        saveCustomerWithOrders();
//        fetchCustomer();
        removeCustomer();

    }
    private void removeCustomer(){
        repository.deleteById(101L);
    }

    private  void fetchCustomer(){
        Customer customer = repository.findById(101L).get();
        System.out.println("customer id : "+customer.getId());
        System.out.println("cutomer name : "+ customer.getName());


        List<Order> orderList = customer.getOrderList();
        System.out.println("customer orders....");
        orderList.forEach(System.out::println);

    }

    private void  saveCustomerWithOrders(){
        Customer customer = new Customer();

        customer.setId(101L);
        customer.setName("Jack");

        Order order1 = new Order(90101L, LocalDate.of(2026,9,25),"Placed");
        Order order2 = new Order(86234L, LocalDate.of(2026,9,24),"Delivered");
        Order order3 = new Order(73957L, LocalDate.of(2026,9,23),"Placed");

        List<Order> orderList = List.of(order1,order2,order3);
        customer.setOrderList(orderList);

        repository.save(customer);



    }
}
