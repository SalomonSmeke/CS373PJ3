package proxy;

//Proxy for piano
public class PianoProxy implements _piano {

	private Player player;
	private _piano piano;

	public PianoProxy(Player player)
	{
		this.player = player;
		piano = new Piano();
	}

	public void play()
	{
		if (player.BAC >= .14)
			System.out.println("Woah! " + player.BAC + " dont worry. we wont let this drunkard play.");
		else
			piano.play();
	}
}
