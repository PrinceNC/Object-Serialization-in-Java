import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	// Static property - Persons array;
	private static Person persons[] = null;

	private static void writeToFile() {
		try {
			// Array of Person objects - In Java, an array is an object and is serializable, given that its contents are also serializable.
			Person temp[] = new Person[] {
					new Person("John", 10),
					new Person("Mary", 15),
					new Person("Jane", 20)
				};

			// Create new ObjectOutputStream - constructor accepts a FileOutputStream object
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Persons.bin"));	
			o.writeObject(temp);	//	Write array "object" to file
			o.close();	// Close ObjectOutputStream
		} catch(IOException e) {  
			System.out.println(e);
		}
	}
	
	private static void readFromFile() {
		try {
			// Create new ObjectInputStream - constructor accepts a FileInputStream object
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("Persons.bin"));
			persons = (Person[]) o.readObject();	// Read array "object" from file and cast with a Person array as the data type 
			o.close();	// Close ObjectInputStream
		} catch(IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
			
	}

	private static void viewPersons() {
		// Call the toString() method for each element in the persons array
		for(Person person : persons) {
			System.out.println(person.toString());
		}
	}
	
	
	public static void main(String[] args) {
		writeToFile();
		readFromFile();
		viewPersons();
		
		// Delete the file when the JVM terminates.
		new File("Persons.bin").deleteOnExit();	
	}
}
