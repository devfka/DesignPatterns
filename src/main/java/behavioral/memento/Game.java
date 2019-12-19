package behavioral.memento;

public class Game
{
    private String time;
    private String content;

    public Game(String time, String content)
    {
        this.time = time;
        this.content = content;
    }


    public String getTime()
    {
        return time;
    }


    public void setTime(String time)
    {
        this.time = time;
    }


    public String getContent()
    {
        return content;
    }


    public void setContent(String content)
    {
        this.content = content;
    }


    public GameMemento save()
    {
        return new GameMemento(this.time, this.content);

    }

    public Game loadLastSave(GameMemento gameMemento)
    {
        this.time = gameMemento.time;
        this.content = gameMemento.content;
        return this;
    }

    @Override public String toString()
    {
        return "Game{" +
            "time='" + time + '\'' +
            ", content='" + content + '\'' +
            '}';
    }
}
