package annie470.U5_W1_D2.entities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class StartRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    private Tavolo tavolo;

    @Override
    public void run(String... args) throws Exception {
        log.info(menu.toString());
        Ordine ordine = new Ordine(
                tavolo, 1, StatusOrder.READY, List.of(  )
    }
}
