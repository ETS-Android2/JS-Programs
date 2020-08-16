package himanshu.app.jsprograms;

public class JsPrograms {
    String title;
    String topic;

    public JsPrograms() {
    }

    public JsPrograms(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
