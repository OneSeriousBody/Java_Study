package FacadePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
public class EmailSmsServiceImpl implements EmailSmsService {

  @Override
  public void sendSms() {
    System.out.println("发送邮件消息");
  }

}
