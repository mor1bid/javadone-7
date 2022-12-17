import java.util.*;
/**
 * Класс, содержащий необходимый для запроса поиска методы.
 */
class Filmname 
{
    private String name;

    public String getname() 
    {
        return name;
    }

    public Filmname(String word) 
    {
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
        System.out.println("Результаты поиска:\n");
        for (String i : films) 
        {
            if(i.contains(word))
            {
                System.out.println(i);
            }
        }
        return word;
    }
}
/**
 * Основной класс. Здесь идёт ввод пользователем запроса на поиск.
 */
public class DZ
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Введите желаемый параметр поиска (название\\год выпуска\\режиссёр): ");
        String myName = work.nextLine();
        Filmname me = new Filmname(myName);
        work.close();
        System.out.println();
    }
}
