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
			System.out.println("���������Ϊ��" + this.pay);
		}
		
		public void getPay(double pay) {
			this.pay = pay;
			System.out.println("���������Ϊ��" + this.pay);
		}

		public void setFee(double fee) {
			this.fee = fee;
			System.out.println("���ѧ��Ϊ��" + this.fee);
		}

		public void getFee(double fee) {
			this.fee = fee;
			System.out.println("���ѧ��Ϊ��" + this.fee);
		}
		public void getshuishou(double pay) {
			this.pay = pay;
			 if(this.pay<1500 & this.pay>0)
		           System.out.println("�����˰Ϊ��"+this.pay*0.03);  
		       else if(this.pay<4500&this.pay>1500) 
		           System.out.println("�����˰Ϊ��"+this.pay*0.1);
		       
		       else if(this.pay>4500 & this.pay<9000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.2);
		       
		       else if(this.pay<35000 & this.pay>9000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.25);
		       
		       else if(this.pay>35000 & this.pay<55000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.3);
		       
		       else if(this.pay>55000 & this.pay<80000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.35);
			 
		       else if(this.pay>80000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.45);
		 
		       else
		           System.out.println("��������");
		}
		public void setshuishou(double pay) {
			this.pay = pay;
			 if(this.pay<1500 & this.pay>0)
		           System.out.println("�����˰Ϊ��"+this.pay*0.03);  
		       else if(this.pay<4500&this.pay>1500) 
		           System.out.println("�����˰Ϊ��"+this.pay*0.1);
		       
		       else if(this.pay>4500 & this.pay<9000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.2);
		       
		       else if(this.pay<35000 & this.pay>9000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.25);
		       
		       else if(this.pay>35000 & this.pay<55000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.3);
		       
		       else if(this.pay>55000 & this.pay<80000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.35);
			 
		       else if(this.pay>80000)
		           System.out.println("�����˰Ϊ��"+this.pay*0.45);
		 
		       else
		           System.out.println("��������");
		}
	
		public static void main(String[] args) {
			
			Graduate graduate1 = new Graduate();
			Graduate graduate2 = new Graduate();
			
			graduate1.name = "��";
			graduate1.age = 25;
			graduate1.sex = "��";
			
			graduate2.name = "��";
			graduate2.age = 24;
			graduate2.sex = "Ů";
			
			System.out.println("���:" + graduate1.name+"   ���䣺"+graduate1.age+"��"+"    �Ա�"+graduate1.sex);
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("��������Ĺ��ʣ�");
			
			double pay = scanner.nextDouble();
			graduate1.setPay(pay);
			graduate1.setshuishou(pay);
			
			
			try {
				System.out.println("���������ѧ�ѣ�");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("ѧ�Ѳ���Ϊ0Ŷ");
				}
			}catch(Exception e) {
				
			}
			
			
			System.out.println();
			
			System.out.println("���:" + graduate2.name+"   ���䣺"+graduate2.age+"��"+"    �Ա�"+graduate2.sex);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("��������Ĺ��ʣ�");
		
			
			double pay1 = scanner1.nextDouble();
			graduate1.setPay(pay1);
			graduate1.setshuishou(pay1);
			
			// ����ѧ��
			try {
				System.out.println("���������ѧ�ѣ�");
				double fee = scanner.nextDouble();
				graduate1.setFee(fee);
				if(fee==0) {
					System.out.println("ѧ�Ѳ���Ϊ0");
				}
			}catch(Exception e) {
				
			}
			

		}
	 

}
