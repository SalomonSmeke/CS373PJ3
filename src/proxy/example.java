package proxy;

import java.util.ArrayList;

public class example {

	/*
	 * Use-Case:
	 * 
	 * A bar has a list of players who wish to play the piano.
	 * They dont want to modify their piano, because there are no inherent rules preventing
	 * anyone from technically playing it. But theyd rather add a set of rules so that
	 * a drunk cant play it.
	 * 
	 * Our Proxy Piano takes in a person with a given BAC. and decides if they can play it or not.
	 * 
	 * This additional task, is then not linked to the Piano itself. 
	 * Which works the same if a drunk plays it or not.
	 * 
	 */

	public static void main(String[] args) {
		_piano piano;
		ArrayList<Player> setList = getSetlist();
		for (int i = 0; i < setList.size(); i++){
			piano = new PianoProxy(setList.get(i));
			piano.play();
		}
	}

	public static ArrayList<Player> getSetlist(){
		ArrayList<Player> out = new ArrayList<>();
		out.add(new Player(.16));
		out.add(new Player(.12));
		out.add(new Player(0));
		return out;
	}
}
