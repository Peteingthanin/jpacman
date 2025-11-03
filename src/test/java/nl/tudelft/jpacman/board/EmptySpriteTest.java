package nl.tudelft.jpacman.board;
import nl.tudelft.jpacman.sprite.EmptySprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class EmptySpriteTest {

    EmptySprite emptySprite;
    @Test
    void testGetHeight() {
        emptySprite = new EmptySprite();
        assertThat(emptySprite.getHeight()).isEqualTo(0);
    }
    @Test
    void testGetWidth() {
        emptySprite = new EmptySprite();
        assertThat(emptySprite.getWidth()).isEqualTo(0);
    }
}
