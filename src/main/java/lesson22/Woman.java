package lesson22;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@AllArgsConstructor
public class Woman {
    private String name;
    private LocalDate lastManicureDate;
    private double balanceForBeautyServices;

    //елси дата последнего маникюра меньше чем за 2 недли то True
    public boolean isHappy(){
        LocalDate currentDate = LocalDate.now();
        long weeks = ChronoUnit.DAYS.between(lastManicureDate, currentDate);

        if (weeks <= 2){
            return true;
        } else  {
            return false;
        }
    }
}
