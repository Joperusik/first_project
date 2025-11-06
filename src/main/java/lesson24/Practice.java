package lesson24;

public class Practice {

    static public int[] removeEllement(int[] arr, int value) {
        //arr [3,2,2,3]
        //return [2,2]
        int valueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                valueCount++;
            }
        }

        int delta = arr.length - valueCount;
        int[] result = new int[delta];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    static public int maxProfit(int[] price) {
        //prices {7,1,5,3,6,4}
        //output 5
        int maxProfit = 0;
        int minPrice = price[0];

        for (int i = 0; i < price.length; i++) {
            int currentProfit = price[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if (price[i] < minPrice) {
                minPrice = price[i];
            }
        }

        return maxProfit;
    }
}
