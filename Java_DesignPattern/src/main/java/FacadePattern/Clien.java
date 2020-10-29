package FacadePattern;

/**
 * @Author CoderWZT
 * @Create on 2020/10/29.
 */

/**
 * 外观模式：也叫门面模式，隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 它向现有的系统添加一个接口，用这一个接口来隐藏实际的系统的复杂性。
 * 使用外观模式，他外部看起来就是一个接口，其实他的内部有很多复杂的接口已经被实
 */
public class Clien {

  public static void main(String[] args) {
    AliSmsService aliSmsService = new AliSmsServiceImpl();
    EmailSmsService emailSmsService = new EmailSmsServiceImpl();
    aliSmsService.sendSms();
    emailSmsService.sendSms();
    System.out.println("================");

    //利用外观模式简化方法
    new Computer().process();
  }

}
