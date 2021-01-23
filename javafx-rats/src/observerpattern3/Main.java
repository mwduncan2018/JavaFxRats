package observerpattern3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		LeadSinger hetfield = new LeadSinger("James Hetfield");
		List<BandMember> bandMembers = new ArrayList<>();
		bandMembers.add(new BandMember("Lars Ulrich"));
		bandMembers.add(new BandMember("Jason Newstead"));
		bandMembers.add(new BandMember("Kirk Hammett"));
		bandMembers.forEach(bandMember -> hetfield.addPropertyChangeListener(bandMember));

		hetfield.setSong("Battery");
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Song --> " + bandMember.getSong()));
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Instructions --> " + bandMember.getInstructions()));
		System.out.println("");
		
		IntStream.range(0, 1000000).forEach(x -> hetfield.setInstructions("Play Faster"));
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Song --> " + bandMember.getSong()));
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Instructions --> " + bandMember.getInstructions()));
		System.out.println("");
		
		hetfield.setSong("The Thing That Should Not Be");
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Song --> " + bandMember.getSong()));
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Instructions --> " + bandMember.getInstructions()));
		System.out.println("");

		hetfield.setInstructions("Play Heavier");
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Song --> " + bandMember.getSong()));
		bandMembers.forEach(bandMember -> System.out.println(bandMember.getName() + " Instructions --> " + bandMember.getInstructions()));
		System.out.println("");
	}
}
