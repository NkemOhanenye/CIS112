package Lab4.Examples;

public class QueueOverflowException extends RuntimeException
{
  public QueueOverflowException()
  {
    super();
  }

  public QueueOverflowException(String message)
  {
    super(message);
  }
}