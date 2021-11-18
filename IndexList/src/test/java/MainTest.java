import java.util.Arrays;
import java.util.HashSet;
import junit.framework.TestCase;
import org.junit.Test;


public class MainTest extends TestCase {

  @Test
  public void testFindIndexElementSum1() {
    int[] A = {1, 5, 9, 2, 8, 10, 3, 7, 6};
    Integer sum = 46;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A),
        new HashSet<>(Arrays.asList(0, 1, 2, 4, 5, 7, 8)));

  }

  @Test
  public void testFindIndexElementSum2() {
    int[] A = {1, -5, 9, -2, 8, 10, -3, 7, 6};
    Integer sum = 0;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>(Arrays.asList(0, 1, 6, 7)));
  }

  @Test
  public void testFindIndexElementSum3() {
    int[] A = {1, -5, 9, 2, 2, 10, -3, 7, 6};
    Integer sum = 4;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>(Arrays.asList(1, 3, 7)));
  }

  @Test
  public void testFindIndexElementSum4() {
    int[] A = {1, 2, 9, 2, 2, 10, -3, 7, 6};
    Integer sum = 4;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>(Arrays.asList(1, 3)));
  }

  @Test
  public void testFindIndexElementSumFail1() {
    int[] A = {1, 2, 9, 2, 2, 10, -3, 7, 6};
    Integer sum = 70;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>());
  }

  @Test
  public void testFindIndexElementSumFail2() {
    int[] A = {1, 2, 9, 2, 2, 10};
    Integer sum = 8;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>());
  }

  @Test
  public void testFindIndexElementSumFail3() {
    int[] A = {};
    Integer sum = 8;
    Main.setNumbers.clear();
    assertEquals(Main.findIndexElementSum(sum, A), new HashSet<>());
  }
}