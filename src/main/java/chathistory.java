import java.time.DateTimeException;
import java.util.Date;

public class chathistory {
    private int id;
    private String user;
    private String chat_text;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getChat_text() {
        return chat_text;
    }

    public void setChat_text(String chat_text) {
        this.chat_text = chat_text;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
