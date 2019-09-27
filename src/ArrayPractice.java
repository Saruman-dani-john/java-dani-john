public class ArrayPractice {
    public static void main(String[] args) {


//        System.out.println(reverse3());

//        sum3([5, 11, 2]);
//        makeMiddle([1, 2, 3, 4]);


        System.out.println(count11("11abc11"));//2
        System.out.println(count11("abc11x11x11"));//3

        System.out.println(countAbc("abaxxaba")); //2
        System.out.println(countAbc("abc")); //1


    }

    //https://codingbat.com/java/Array-1


    // Given an array of ints length 3, return a new array with the elements
    // in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

    int[]a = {5,11,2};


    public static int[] reverse3(int[] nums) {
        for(int i = 0; i < nums.length / 2; i++)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        return nums;

    }

    //Given an array of ints length 3, return the sum of all the elements

//    public static int sum3(int[] nums) {
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            sum +=  nums[i];
//        }
//        return sum;
//    }

    //Given an array of ints of even length, return a new array length 2 containing the middle two
    // elements from the original array. The original array will be length 2 or more.

//    public static int[] makeMiddle(int[] nums) {
//        int[] a = new int[2];
//        if(nums.length>1) {
//            a[1]=nums[nums.length/2];
//            a[0]=nums[nums.length/2-1];
//            return a;
//        } else {
//            a[2]=nums[((nums.length+1)/2) -1];
//        }
//        return a;
//    }

//RECURSION

    //Given a string, compute recursively (no loops) the number of "11" substrings in the string.
    // The "11" substrings should not overlap.

    public static int count11(String str) {
        if(str.length() < 2)
            return 0;
        if(str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }

    //Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

    public static int countAbc(String str) {
        String left;
        if(str.length() < 3)
            return 0;
        left = str.substring(0, 3);
        if(left.equals("abc"))
            return 1 + countAbc(str.substring(3));
        if(left.equals("aba"))
            return 1 + countAbc(str.substring(2));
        return countAbc(str.substring(1));
    }


}
