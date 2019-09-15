import modifiers.AddModifier;
import modifiers.IModifier;
import modifiers.MultModifier;
import org.junit.Assert;
import org.junit.Test;

public class ModifierTest {

    @Test
    public void multiplicationTest() {

        IModifier mod = new MultModifier(3);
        mod = new MultModifier(mod, 4);
        double result = mod.applyModifier(1);
        double expected = 12;
        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test
    public void additionTest() {

        IModifier mod = new AddModifier(3);
        mod = new AddModifier(mod, 4);
        double result = mod.applyModifier(1);
        double expected = 8;
        Assert.assertEquals(expected, result, 0.0001);
    }

    @Test
    public void combinedTest() {

        IModifier mod = new AddModifier(3);
        mod = new MultModifier(mod, 4);
        double result = mod.applyModifier(1);
        double expected = 16;
        Assert.assertEquals(expected, result, 0.0001);
    }
}
