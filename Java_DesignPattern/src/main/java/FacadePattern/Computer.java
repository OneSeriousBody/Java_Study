package FacadePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */
//创建门面
public class Computer {
  AliSmsService aliSmsService;
  EmailSmsService emailSmsService;

  public Computer(){
    aliSmsService = new AliSmsServiceImpl();
    emailSmsService = new EmailSmsServiceImpl();
  }

  //只要调用它
  public void process(){
    aliSmsService.sendSms();
    emailSmsService.sendSms();
  }
}
