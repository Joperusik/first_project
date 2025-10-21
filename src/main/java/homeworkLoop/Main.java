package homeworkLoop;

public class Main {
    static void main() {
        int [] nums = {1,2,3,4,5,6};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
    }
}
