package annie470.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Menu {
    private List<Drink> drinks;
    private List<Pizza> pizzas;
    private List<Topping> toppings;
}
