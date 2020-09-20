package my_first_spring_boot;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Webアプリのリクエストを受け付けるクラスであることの指定
@EnableAutoConfiguration // 様々な設定を自動的に有効化
public class App {
    @RequestMapping("/") // URLのパスの指定
    public String index() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) {
      // Spring Bootによるアプリケーションを起動するための処理です。
      SpringApplication.run(App.class, args);
    }
}