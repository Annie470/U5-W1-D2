package annie470.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Drink extends Item {
    private String type;
    private int calories;
    private double price;

    @Override
    public double getPrice() {
        return this.price;
    }
}
