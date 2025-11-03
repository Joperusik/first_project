package homework20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private float fuel;
    private float consumption;
    private LocalDate dateOutOfMaintenance;
}
