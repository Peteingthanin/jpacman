package nl.tudelft.jpacman.board;
import nl.tudelft.jpacman.sprite.EmptySprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * class to test EmptySprite.
 */
public class EmptySpriteTest {

    private EmptySprite emptySprite;

    /**
     * test getHeight().
     */
    @Test
    void testGetHeight() {
        emptySprite = new EmptySprite();
        assertThat(emptySprite.getHeight()).isEqualTo(0);
    }

    /**
     * test getWidth().
     */
    @Test
    void testGetWidth() {
        emptySprite = new EmptySprite();
        assertThat(emptySprite.getWidth()).isEqualTo(0);
    }
}
