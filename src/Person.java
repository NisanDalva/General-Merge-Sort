
class Person implements Comparable<Person> {
	
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "name: " + name + " - id: " + id;
	}

	@Override
	public int compareTo(Person o) {
		int x = this.id - o.id;
		if(x == 0)
			return this.name.compareTo(o.name);
		return x;
	}
}