package lesson23StringBuilder;

public class Practice {

    public static boolean isPalindrome(int x) {
        //121 = true
        //10 = false
        //-121 = false

        String originalString = String.valueOf(x); // x теперь string

        StringBuilder sb = new StringBuilder(originalString);
        String reverseString = sb.reverse().toString(); //StringBuilder to String

        if (originalString.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }

    public static int majorityElement(int[] nums) {
        //nums = [2,3,3]

        //алгоритм
        //majorityElement = nums[0]


        //идем по масибу и смотрим мклько раз встречается этот эллемент
        for (int i = 0; i < nums.length; i++) {
            int majorityElement = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                //если больше чем n/2 возврашаем этот эллемент
                if (nums[j] == majorityElement) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return majorityElement;
            }
        }
        return 0;
    }


}
