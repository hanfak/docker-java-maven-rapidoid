import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.Page;

@Controller
public class Hello {

    @Page("/")
    public String hello() {
        return "Hello, world!";
    }

}
