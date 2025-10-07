package annie470.U5_W1_D2;

import annie470.U5_W1_D2.entities.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class ConfigClass {

    //DRINKS BEANZ
    @Bean(name = "lemonade")
    public Drink getLemonade(){return new Drink("Lemonade (0.33)", 128, 1.29 );
    }
    @Bean(name = "water")
    public Drink getWater(){return new Drink("Water (0.5l)", 0, 1.29 );
    }
    @Bean(name = "wine")
    public Drink getWine(){return new Drink("Wine (0.75l, 13%)", 607, 7.49 );
    }
    //TOPPINGS BEANS
    @Bean(name = "tomato")
    public Topping getTomato(){return new Topping("Tomato", 12, 0.50 );
    }
    @Bean(name = "cheese")
    public Topping getCheese(){return new Topping("Cheese", 92, 0.69 );
    }
    @Bean(name = "salami")
    public Topping getSalami(){return new Topping("Salami", 86, 0.99 );
    }
    @Bean(name = "ham")
    public Topping getHam(){return new Topping("Ham", 35, 0.99 );
    }
    @Bean(name = "onions")
    public Topping getOnions(){return new Topping("Onions", 22, 0.69 );
    }
    @Bean(name = "pineapple")
    public Topping getPineapple(){return new Topping("Pineapple", 24, 0.79 );
    }

    //PIZZA BEANS
    @Bean(name = "salami pizza")
    public Pizza getSalamiPizza(){return new Pizza("Salami Pizza", List.of(getCheese(), getTomato(), getSalami()) ,1160, 5.99 );
    };
    @Bean(name = "hawaiian pizza")
    public Pizza getHawaiianPizza(){return new Pizza("Hawaiian Pizza", List.of(getCheese(), getTomato(), getHam(), getPineapple()) ,1280, 7.99 );
    };
    @Bean(name = "margherita pizza")
    public Pizza getMargheritaPizza(){return new Pizza("Margherita Pizza", List.of(getCheese(), getTomato()) ,1020, 4.99 );
    };

    //MENU BEAN
    @Bean(name = "menu")
    public Menu getMenu(){
        List<Drink> drinks = List.of(getLemonade(), getWater(), getWine());
        List<Pizza> pizzas = List.of(getMargheritaPizza(), getHawaiianPizza(), getSalamiPizza());
        List<Topping> toppings = List.of(getCheese(), getTomato(), getOnions(), getSalami(), getHam(), getPineapple());
        return new Menu(drinks, pizzas , toppings);
    }

    //TABLE
    @Bean(name = "test table")
    public Tavolo getTavolo(){
        return new Tavolo(12,4, StatusTable.OCCUPIED);
    }



}
