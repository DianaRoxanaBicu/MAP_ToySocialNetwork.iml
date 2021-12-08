package domain;

import java.time.LocalDate;
import java.util.Date;

public class Friendship extends Entity {
    public static class STATUS{
      public static String PENDING="pending";
      public static String APPROVED="approved";
      public static String REJECTED="rejected";
    };

    private final String friendOneId;
    private final String friendTwoId;
    private final LocalDate timestamp;
    private String status;

    public Friendship(String id, String friendOne, String friendTwo, LocalDate timestamp, String status) {
        super(id);
        this.friendOneId = friendOne;
        this.friendTwoId = friendTwo;
        this.timestamp = timestamp;
        this.status = status;
    }

    /**
     * Getter for first friend id
     * @return String
     */
    public String getFriendOneId() {
        return friendOneId;
    }

    /**
     * Getter for second friend id
     * @return String
     */
    public String getFriendTwoId() {
        return friendTwoId;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean isApproved() {
        return this.status.equals("approved");
    }

    public boolean isPending() {
        return this.status.equals("pending");
    }

    public boolean isRejected() {
        return this.status.equals("rejected");
    }

    @Override
    public String toString() {
        return "Friendship{" +
                "id='" + id + '\'' +
                ", friendOneId='" + friendOneId + '\'' +
                ", friendTwoId='" + friendTwoId + '\'' +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                '}';
    }
}
