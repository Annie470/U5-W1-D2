package annie470.U5_W1_D2.entities;

import lombok.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@ToString
@Setter
@NoArgsConstructor
@Component
@PropertySource("application.properties")
public class Ordine {
    private Tavolo tavolo;
    private int n;
    private StatusOrder statusOrder;
    private List<Item> items;
    @Setter(AccessLevel.NONE)
    private double bill;
    @Value("${cover.charge}")
    @Setter(AccessLevel.NONE)
    private int coverCharge;

    public Ordine(Tavolo tavolo, int n, StatusOrder statusOrder, List<Item> items) {
        this.tavolo = tavolo;
        this.n = n;
        this.statusOrder = statusOrder;
        this.items = items;
    }

    public void prepareBill() {
        double totalPrices = items.stream().mapToDouble(Item::getPrice).sum();
        this.bill = totalPrices + (coverCharge * tavolo.getNPax());
    }
}
