package lambda.chapter01;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Artist {
	
	private String name;
	private List<Artist> members;
	private String nationality;
	
	public Artist(String name,String nationality) {
		this(name, Collections.emptyList(), nationality);
	}
	
	public  Artist(String name,List<Artist> members,String nationality) {
		Objects.requireNonNull(name);
		Objects.requireNonNull(members);
		Objects.requireNonNull(nationality);
		this.name = name;
		this.members = members;
		this.nationality = nationality;
	}


	public String getName() {
		return name;
	}
	
	public Stream<Artist> getMembers() {
		return members.stream();
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public boolean isSolo(){
		return members.isEmpty();
	}
	
	public boolean isForm(String nationality){
		return this.nationality.equals(nationality);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	public Artist copy(){
		List<Artist> members = getMembers().map(Artist::copy).collect(Collectors.toList());
		return new Artist(name,members, nationality);
	}
}
