package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controllerで"このプログラムはControllerです"と宣言
@Controller
public class HelloController {

// ↓URLの設定(今回はURLが"/hello"となる)
@RequestMapping(value="/hello")
// helloメソッド
private String hello(){
// returnで飛ばす先を指定
return "/index.html";
}
}
