package database;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Message {
    private int Id;
    private String Author;
    private String Content;
    private LocalDateTime Created;

    public Message() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public LocalDateTime getCreated() {
        return Created;
    }

    public void setCreated(LocalDateTime created) {
        Created = created;
    }

    public static List<Message> getSampleMessages() {
        List<Message> messages = new ArrayList<>();
        // Przykładowa wiadomość 1
        Message message1 = new Message();
        message1.setId(1);
        message1.setAuthor("Peter");
        message1.setContent("Let's conquer the world!");
        message1.setCreated(LocalDateTime.now());
        messages.add(message1);
        // Przykładowa wiadomość 2
        Message message2 = new Message();
        message2.setId(2);
        message2.setAuthor("John");
        message2.setContent("I will avenge my dog.");
        message2.setCreated(LocalDateTime.now().plusHours(1));
        messages.add(message2);
        // Przykładowa wiadomość 3
        Message message3 = new Message();
        message3.setId(3);
        message3.setAuthor("Andrew");
        message3.setContent("I shall rule.");
        message3.setCreated(LocalDateTime.now().plusDays(1));
        messages.add(message3);
        // Przykładowa wiadomość 4
        Message message4 = new Message();
        message4.setId(4);
        message4.setAuthor("Diana");
        message4.setContent("Tell me the truth!");
        message4.setCreated(LocalDateTime.of(2025, 5, 19, 12, 0, 0));
        messages.add(message4);

        return messages;
    }
}
