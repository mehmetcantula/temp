
import org.junit.Assert;
import org.junit.Test;


public class TreeAppMainTest {

    @Test
    public void printTreeTest() {
        int rowNumber = 10;
        Assert.assertEquals((rowNumber * 2) + 1, TreeAppMain.printTree(rowNumber));
    }
}