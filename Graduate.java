package InterfaceProject;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{

		String name;
		String sex;
		int age;
		double fee;
		double pay;
		double shuishou;

		public void setPay(double pay) {
			this.pay = pay;
			System.out.println("你的年收入为：" + this.pay);
		}
		
		public void getPay(double pay) {
			this.pay = pay;
			System.out.println("你的年收入为：" + this.pay);
		}

		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("你的学费为：" + this.fee);
		}

		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("你的学费为：" + this.fee);
		}
		public void getshuishou(double pay) {
			this.pay = pay;
			 if(this.pay<1500 & this.pay>0)
		           System.out.println("你的收税为："+this.pay*0.03);  
		       else if(this.pay<4500&this.pay>1500) 
		           System.out.println("你的收税为："+this.pay*0.1);
		       
		       else if(this.pay>4500 & this.pay<9000)
		           System.out.println("你的收税为："+this.pay*0.2);
		       
		       else if(this.pay<35000 & this.pay>9000)
		           System.out.println("你的收税为："+this.pay*0.25);
		       
		       else if(this.pay>35000 & this.pay<55000)
		           System.out.println("你的收税为："+this.pay*0.3);
		       
		       else if(this.pay>55000 & this.pay<80000)
		           System.out.println("你的收税为："+this.pay*0.35);
			 
		       else if(this.pay>80000)
		           System.out.println("你的收税为："+this.pay*0.45);
		 
		       else
		           System.out.println("输入有误！");
		}
		public void setshuishou(double pay) {
			this.pay = pay;
			 if(this.pay<1500 & this.pay>0)
		           System.out.println("你的收税为："+this.pay*0.03);  
		       else if(this.pay<4500&this.pay>1500) 
		           System.out.println("你的收税为："+this.pay*0.1);
		       
		       else if(this.pay>4500 & this.pay<9000)
		           System.out.println("你的收税为："+this.pay*0.2);
		       
		       else if(this.pay<35000 & this.pay>9000)
		           System.out.println("你的收税为："+this.pay*0.25);
		       
		       else if(this.pay>35000 & this.pay<55000)
		           System.out.println("你的收税为："+this.pay*0.3);
		       
		       else if(this.pay>55000 & this.pay<80000)
		           System.out.println("你的收税为："+this.pay*0.35);
			 
		       else if(this.pay>80000)
		           System.out.println("你的收税为："+this.pay*0.45);
		 
		       else
		           System.out.println("输入有误！");
		}
	
		public static void main(String[] args) {
			
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			
			graduate1.name = "李";
			graduate1.age = 25;
			graduate1.sex = "男";
			
			graduate2.name = "王";
			graduate2.age = 24;
			graduate2.sex = "女";
			
			System.out.println("你好:" + graduate1.name+"   年龄："+graduate1.age+"岁"+"    性别："+graduate1.sex);
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入你的工资：");
			
			double pay = scanner.nextDouble();
			graduate1.setPay(pay);
			graduate1.setshuishou(pay);
			
			
			try {
				System.out.println("请输入你的学费：");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("学费不能为0哦");
				}
			}catch(Exception e) {
				
			}
			
			
			System.out.println();
			
			System.out.println("你好:" + graduate2.name+"   年龄："+graduate2.age+"岁"+"    性别："+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("请输入你的工资：");
		
			
			double pay1 = scanner1.nextDouble();
			graduate1.setPay(pay1);
			graduate1.setshuishou(pay1);
			
			// 设置学费
			try {
				System.out.println("请输入你的学费：");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("学费不能为0");
				}
			}catch(Exception e) {
				
			}
			

		}
	 

}
