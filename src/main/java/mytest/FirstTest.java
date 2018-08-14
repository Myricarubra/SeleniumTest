package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private static final String PATH = "C:\\Users\\zddd\\Desktop\\chromedriver.exe"; //改成Mac驱动的地址

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", PATH); // 此处PATH替换为你的chromedriver所在路径
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.baidu.com");
        System.out.println(webDriver.getTitle());
    }
}