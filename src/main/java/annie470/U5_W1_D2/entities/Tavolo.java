package annie470.U5_W1_D2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Tavolo {
    private int n;
    private int nPax;
    private StatusTable statusTable;
}
