package section13Enumeracoes.Enum03Exercicio.application;

import section13Enumeracoes.Enum03Exercicio.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        //limpar buffer
        sc.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());


        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        //limpar buffer
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.printf("Enter #%s item data: \n", i + 1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double price = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            //limpar buffer
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, price, new Product(productName, price));
            order.addItem(orderItem);

        }

        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);



    }
}
