import org.junit.Test;
import sh.hell.compactchess.exceptions.ChessException;
import sh.hell.compactchess.game.Game;
import sh.hell.compactchess.game.Opening;

import static junit.framework.TestCase.assertEquals;

public class Tests
{
	@Test(timeout = 3000L)
	public void openings() throws ChessException
	{
		System.out.println("Openings\n");
		final Game game = Game.fromPGN("1.e4 e5 2.Nf3 Nc6 3.Bb5 a6 4.Ba4 Nf6 5.O-O Be7 6.Re1 b5 7.Bb3 O-O 8.c3 d5 9.exd5 Nxd5 10.Nxe5 Nxe5 11.Rxe5 c6 12.d4 Bd6 13.Re1 Qh4 14.g3 Qh3 15.Be3 Bg4 16.Qd3 Rae8 17.Nd2 Re6 18.a4 Qh5 19. axb5").get(0);
		Opening.insertInto(game, false, true);
		System.out.println(game.toPGN());
		assertEquals("Ruy Lopez: Marshall, Main Line, Spassky Variation", game.tags.get("Opening"));
		assertEquals("C89", game.tags.get("ECO"));
		int i = 0;
		assertEquals("B00 King's Pawn", game.moves.get(i++).getAnnotation());
		assertEquals("C20 King's Pawn Game", game.moves.get(i++).getAnnotation());
		assertEquals("C40 King's Knight Opening", game.moves.get(i++).getAnnotation());
		assertEquals("C44 King's Knight Opening: Normal Variation", game.moves.get(i++).getAnnotation());
		assertEquals("C60 Ruy Lopez", game.moves.get(i++).getAnnotation());
		assertEquals("C70 Ruy Lopez", game.moves.get(i++).getAnnotation());
		assertEquals("C68 Ruy Lopez: Columbus Variation", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("C78 Ruy Lopez: Morphy Defense", game.moves.get(i++).getAnnotation());
		assertEquals("C84 Ruy Lopez: Closed Variations", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("C88 Ruy Lopez: Closed", game.moves.get(i++).getAnnotation());
		assertEquals("C88 Ruy Lopez: Closed, 7... O-O", game.moves.get(i++).getAnnotation());
		assertEquals("C88 Ruy Lopez: Closed, 8. c3", game.moves.get(i++).getAnnotation());
		assertEquals("C89 Ruy Lopez: Marshall Attack", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("C89 Ruy Lopez: Marshall Attack, Modern Variation", game.moves.get(i++).getAnnotation());
		assertEquals("C89 Ruy Lopez: Marshall Attack, Main Line", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("C89 Ruy Lopez: Marshall Attack, Modern Main Line", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i++).getAnnotation());
		assertEquals("C89 Ruy Lopez: Marshall, Main Line, Spassky Variation", game.moves.get(i++).getAnnotation());
		assertEquals("", game.moves.get(i).getAnnotation());
	}
}
