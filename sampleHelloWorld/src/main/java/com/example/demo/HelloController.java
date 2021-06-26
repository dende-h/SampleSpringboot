package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("title", "Hello Springboot!" );
		return "index";
	}
	@RequestMapping(value = "/callResponce")
	public ModelAndView responce(@RequestParam String name, String tweet) {
		ModelAndView mav = new ModelAndView();//メソッドで引数を受け取りながらmavインスタンスを生成
		mav.setViewName("callResponce");//インスタンスでsetViewNameメソッドでindex.htmlにアクセス
		mav.addObject("responce", "こんにちは、" + name + "です " + "座右の銘は" + tweet);//addObjectメソッドでresponceをキーにして値を返す
		return mav;
	}
}