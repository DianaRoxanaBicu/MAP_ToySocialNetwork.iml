package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Message extends Entity {

    private final String from;
    private final String[] to;
    private final String message;
    private final String reply;
    private final LocalDateTime timestamp;

    public Message(String id, String from, String[] to, String message, String reply, LocalDateTime timestamp) {
        super(id);
        this.from = from;
        this.to = to;
        this.message = message;
        this.reply = reply;
        this.timestamp = timestamp != null ? timestamp : LocalDateTime.now();
    }

    public String getFrom() {
        return from;
    }


    public String[] getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

    public String getReply() {
        return reply;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to=" + Arrays.toString(to) +
                ", message='" + message + '\'' +
                ", reply='" + reply + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}