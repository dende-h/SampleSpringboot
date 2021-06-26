package com.example.demo;

class PriceSim{
	private String planIn;
	private String telPlanIn;
	private String disCountIn;
	private String setDisIn;
	private String payDisIn;
	
	public PriceSim(String planIn, String telPlanIn, String disCountIn, String setDisIn, String payDisIn) {
		super();
		this.planIn = planIn;
		this.telPlanIn = telPlanIn;
		this.disCountIn = disCountIn;
		this.setDisIn = setDisIn;
		this.payDisIn = payDisIn;
	}

	public String getPlanIn() {
		return planIn;
	}




	public void setPlanIn(String planIn) {
		this.planIn = planIn;
	}




	public String getTelPlanIn() {
		return telPlanIn;
	}




	public void setTelPlanIn(String telPlanIn) {
		this.telPlanIn = telPlanIn;
	}




	public String getDisCountIn() {
		return disCountIn;
	}




	public void setDisCountIn(String disCountIn) {
		this.disCountIn = disCountIn;
	}




	public String getSetDisIn() {
		return setDisIn;
	}




	public void setSetDisIn(String setDisIn) {
		this.setDisIn = setDisIn;
	}




	public String getPayDisIn() {
		return payDisIn;
	}




	public void setPayDisIn(String payDisIn) {
		this.payDisIn = payDisIn;
	}



/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	   out.println("<html><body>");
	   out.println("<center><h2>料金計算結果</h2></center>");
	   
	   String planIn,telPlanIn,discountIn,setDisIn,payDisIn;
	   double plan,telPlan,discount,setDis,payDis,telFee;
	   planIn = request.getParameter("plan1");
	   plan = Double.parseDouble(planIn);
	   telPlanIn = request.getParameter("telPlan1");
	   telPlan = Double.parseDouble(telPlanIn);
	   discountIn = request.getParameter("discount1");
	   discount = Double.parseDouble(discountIn);
	   setDisIn = request.getParameter("setDis1");
	   setDis = Double.parseDouble(setDisIn);
	   payDisIn = request.getParameter("payDis1");
	   payDis = Double.parseDouble(payDisIn);
	   if(plan == 3150 && setDis == 1000){
			setDis -= 1000;
		}else if(plan == 4150 && setDis == 1000){
			setDis -= 500;
		}else{
			setDis -=0;
		}
		double tax = 1.1;
		
		telFee = (plan + telPlan - discount - setDis - payDis);
		telFee *= tax;

	
      out.println("<center><font size = +1>選択した料金プランは税込み   </font><font size = +2><font color = red><b>" + Math.round(telFee) + "円   </b></font></font><font size = +1>です。</font></center>");
	   
	}*/

}