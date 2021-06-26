package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PriceController{
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input5(Model model) {
		model.addAttribute("title", "ドコモの料金プランを選択");
		return "input5";
	}
	@RequestMapping(value = "/simulation", method = RequestMethod.GET)
	public ModelAndView responce2(@RequestParam("name") String plan1, String telPlan1, String discount1, String setDis1, String payDis1) {
		ModelAndView mav = new ModelAndView();//メソッドで引数を受け取りながらmavインスタンスを生成
		mav.setViewName("result");//インスタンスでsetViewNameメソッドでindex.htmlにアクセス
		mav.addObject("responce2", plan1 + telPlan1 + discount1 + setDis1 + payDis1);//addObjectメソッドでresponceをキーにして値を返す
		return mav;
		//return mav;
	}
}
