package problem_set5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*Create a class Person with fields like name and age. Ȑ Serialize and deserialize a list of Person objects to/from
a file.*/
public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Jeev", 22);
		Person p2 = new Person("Jacob", 69);
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		// Serialize
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("people.ser"));) {
			out.writeObject(people);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Deserialise
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("people.ser"));) {
			ArrayList<Person> deserialisedPeople = (ArrayList<Person>) in.readObject();
			for (Person p : deserialisedPeople) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
