import org.rapidoid.setup.On;

public class AnotherServer {
    public static void main(String[] args) {
        On.port(8082);
        On.get("/").html("Getting adfaX");
    }
}
