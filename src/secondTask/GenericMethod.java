package secondTask;

import java.util.Collection;

public class GenericMethod {
	static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
	    for (T object : array) {
	        collection.add(object);
	    }
	}
}
