import com.linuxea.builder.Person;
import com.linuxea.builder.PersonBuilder;

public class Main {

    public static void main(String[] args) {

        Person person = new PersonBuilder()
                .name("linuxea")
                .age(18)
                .gender(1)
                .address("卡塔尔")
                .build();

        System.out.println(person);
    }
}