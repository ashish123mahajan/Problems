import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadStream {
	

	public static void main(String[] args) throws URISyntaxException {
		try (Stream<String> stream = Files.lines(Paths.get(FileReadStream.class.getResource("/test.txt").toURI()))) {
			stream.forEach(System.out::println);

		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	

}
