package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


/**.
 * class to test board
 */
public class BoardTest {
    /**.
     *test if board is correct and check no null grid
     */
    @Test
    public void testBoard() {
        //1*1 grid
        Square square = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = square;

        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }


    /*@Test
    public void testBoard2() {
        Square square = new BasicSquare();
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        try {
            grid[0][0] = null;

        }
        catch (Exception e) {

            assertThat(board.invariant()).isTrue();
            assertThat(board.getHeight()).isEqualTo(1);
            assertThat(board.getWidth()).isEqualTo(1);

            assertThat(board.squareAt(0, 0)).isEqualTo(square);
        }*/
}



