import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        /* Arrays have a fixed Size */
        Character[] characterArray = new Character[2];
        characterArray[0] = 'A';
        characterArray[1] = 'B';
        for (int i = 0; i < characterArray.length; i++) {
            System.out.println(characterArray[i]);
        }

        /* Lists have a dynamical Size*/
        List<Character> characterList = new ArrayList<>();
        characterList.add('A');
        characterList.add('B');
        for (Character character : characterList) {
            System.out.println(character);
        }

        /* Sets has no Order */
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('A');
        characterSet.add('A');
        characterSet.add('B');
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* Maps stores a Key-Value Pair with the latest Value*/
        Map<Integer, Character> characterMap = new HashMap<>();
        characterMap.put(1, 'A');
        characterMap.put(2, 'A');
        characterMap.put(2, 'B');
        for(int key : characterMap.keySet()) {
            System.out.println(characterMap.get(key));
        }

        /* Stacks only allow Access to the latest Item and follow the LIFO Principal */
        /* LIFO:= Last in first out */
        Stack<Character> characterStack = new Stack<>();
        characterStack.push('B');
        characterStack.push('A');
        while(!characterStack.isEmpty()){
            System.out.println(characterStack.peek());
            characterStack.pop();
        }

        /* Queues only allow Access to the first Item and follow the FIFO Principal */
        /* FIFO:= First in first out*/
        Queue<Character> characterQueue = new LinkedList<>();
        characterQueue.add('A');
        characterQueue.add('B');
        while(!characterQueue.isEmpty()){
            System.out.println(characterQueue.peek());
            characterQueue.poll();
        }
    }
}
