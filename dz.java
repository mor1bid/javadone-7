import java.util.*;
class filn {
    private String name;
    public String getnm() {
        return name;
    }

    public filn(String word) {
        this.name = word;
        this.films(name);
    }
    private String films(String word) 
    {
        LinkedList<String> films = new LinkedList<>();
        films.add("The Dark Knight, 2008 год, Кристофер Нолан, боевик");
        films.add("Inсeption, 2010 год, Кристофер Нолан, триллер");
        films.add("Dunkirk, 2017 год, Кристофер Нолан, военная драма");
        films.add("The Elephant Man, 1980 год, Дэвид Линч, драма");
        films.add("Mulholland Drive, 2001 год, Дэвид Линч, триллер");
        System.out.println("Результаты поиска: ");
        for (String i : films) {
            if(i.contains(word)) {
                System.out.println(i);
            }
        }
        return word;
    }
}
/**
 * dz
 */
public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.printf("Введите желаемое название фильма: ");
        String na = work.nextLine();
        filn me = new filn(na);
        work.close();
    }
}
