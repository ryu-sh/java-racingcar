package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.Winners;
import racingcar.ui.ResultView;

import static racingcar.utils.StringUtils.inputStringSeperator;

public class RacingCar {
    public static String play(String carNames, int moveCount) {
        String[] carNamesArray = inputStringSeperator(carNames);
        Cars cars =  new Cars(carNamesArray);
        for(int i=0; i<moveCount; i++){
            cars.moveCars();
            ResultView.printMovingCars(cars);
        }
        return new Winners(cars).getWinnerNames();
    }
}
