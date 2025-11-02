import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // TODO 1: Create Supplier<User>
        //no input, return user
        Supplier<User> newUser = ()-> new User("Thimal", 24);
//        System.out.println(newUser.get().toString());

        // TODO 2: Create Consumer<User>
        //input user, no return
        Consumer<User> user1 = (User oldUser)->{
            System.out.println("Name - "+newUser.get().getName()+", Age - "+newUser.get().getAge());
        };
        user1.accept(newUser.get());

        // TODO 3: Create Function<User, String>
        //input user, return string
        Function<User, String> greeting = (User oldUser)-> "Hello "+oldUser.getName()+", You are "+oldUser.getAge()+" years old";
        System.out.println(greeting.apply(newUser.get()));

        // TODO 4: Create Predicate<User>
        //input user, return boolean
        Predicate<User> isOlder = (User user)->{
            if(user.getAge() >= 18){
                return true;
            }else {
                return false;
            }
        };

        System.out.println("Is old enough - "+isOlder.test(newUser.get()));
    }
}


class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
