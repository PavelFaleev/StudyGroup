import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
       
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");
        StudyGroup group4 = new StudyGroup("Group 4");

        Stream stream1 = new Stream(Arrays.asList(group1, group2)); // 2 группы
        Stream stream2 = new Stream(Arrays.asList(group1)); // 1 группа
        Stream stream3 = new Stream(Arrays.asList(group1, group2, group3, group4)); // 4 группы

    
        List<Stream> streams = Arrays.asList(stream1, stream2, stream3);

        Controller controller = new Controller();
        controller.sortStreams(streams);

        System.out.println("Sorted streams:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroupCount() + " groups.");
        }
    }
}