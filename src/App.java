
import entities.Contract;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import services.ContractService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/YYYY): ");
        LocalDateTime date = LocalDateTime.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double totalValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        Integer months = sc.nextInt();

        Contract contract = new Contract(new ContractService(),number, date, totalValue);



        

    }
}
