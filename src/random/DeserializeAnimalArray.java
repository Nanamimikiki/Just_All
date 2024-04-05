package random;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class DeserializeAnimalArray {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(3);
        objectOutputStream.writeObject(new Animal("Fox"));
        objectOutputStream.writeObject(new Animal("Wolf"));
        objectOutputStream.writeObject(new Animal("Dog"));
        objectOutputStream.close();
        System.out.println(Arrays.toString(deserializeAnimalArray(byteArrayOutputStream.toByteArray())));
    }
    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException {
        Animal[] animalArray;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int numberOfAnimals = ois.readInt();
            animalArray = new Animal[numberOfAnimals];
            for (int i = 0; i < numberOfAnimals; i++) {
                animalArray[i] = (Animal) ois.readObject();
            }
        } catch (ClassNotFoundException | ClassCastException | NegativeArraySizeException | IOException e){
            throw new IllegalArgumentException(e);
        }
        return animalArray;
    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
