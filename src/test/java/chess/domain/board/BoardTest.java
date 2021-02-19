package chess.domain.board;

import chess.view.BoardView;
import org.junit.jupiter.api.BeforeEach;

class BoardTest {
    private Board board;
    private BoardView boardView;

    @BeforeEach
    void setup() {
        board = new Board();
        board.initialize();
        boardView = new BoardView(board);
    }
}