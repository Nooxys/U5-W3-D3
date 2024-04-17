package CiroVitiello.U5W3D3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.time.LocalDate;



@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Ciro","Vitiello", LocalDate.of(1994,1,13));
        UserData user = new UserData();
        user.getData(info);
        System.out.println("EXERICSE 1");
        System.out.println(user);
    }
}
