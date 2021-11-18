import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Программа из массиива A ищет заданную сумму sum из элементов массива.
Результат выдает на экран в виде масиива инндексов, которые соответствуют вычислению суммы.
Программа выдает только первый найденный результат, который находится ближе к началу массива
*/

public class Main {
  public static final Set< String>  setNumbers = new HashSet<>();
  public static void main(String[] args) {
    int[] A = {1, -2, 3, 4};
    Integer sum = 2;
    System.out.printf("Исходный массив %s \n", Arrays.toString(A));
    System.out.printf("Искомая сумма %s \n", sum);

    System.out.println(findIndexElementSum(sum, A));
  }

    static void outMas(int[] nums, int num, String s)
    {
      if (num == nums.length)
      {
        if (!s.equals("")) {
          setNumbers.add(s);
        }
        return;
      }
      outMas(nums,num+1,s);
      s = s + nums[num] + ' ';
      outMas(nums,num+1,s);
    }

    public static Set<Integer> findIndexElementSum(int sum, int[] A) {
      if (A.length == 0) {
        return new HashSet<>();
      }
        outMas(A,0,"");
        for (String numbers: Main.setNumbers) {
          String[] arrayNumbers = numbers.split(" ");
          int sumAll = Arrays.stream(arrayNumbers)
              .mapToInt(Integer::parseInt).sum();
          if (sumAll == sum) {
            return arrayNumbersToSetIndex(arrayNumbers, A);
          }
        }
        return new HashSet<>();
    }

    private static Set<Integer> arrayNumbersToSetIndex(String[] arrayNumbers, int[] A) {
    Set<Integer> indexSet = new HashSet<>();

      for (int j = 0; j < arrayNumbers.length; j++) {
        for (int i = 0; i < A.length; i++) {
          if (Integer.parseInt(arrayNumbers[j]) == A[i]) {
            if (!indexSet.contains(i)) {
              indexSet.add(i);
              break;
            }
          }
        }
      }
      return indexSet;
    }

}



