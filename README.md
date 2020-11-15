## G202 2020322107  李雪明
## interface实验
## 一、实验目的：
  
  掌握Java中抽象类和抽象方法的定义 
  掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
  了解异常的使用方法，并在程序中根据输入情况做异常处理
  
## 二、实验内容
  
  定义两个接口类分别为Studentinterface、Teacherinterface，主类Graduate，Studentinterface接口中包括缴纳学费、查学费的方法，Teacherinterface接口中包括发放薪水和查询薪水的方法。
  主类Graduate中定义了成员变量：String name、String sex、int age、double fee、double pay、double shuishou。fee、pay、shuihsou分别为学费、收入、税。
  public static void main(String[] args)这里模拟了两个人，分别为李男和王女。语句Scanner scanner = new Scanner(System.in)实现Scanner类实现运行时交互式输入。
  方法public void setPay(double pay)、public void getPay(double pay)规定工资的获取和查询，方法public void getFee(double fee)、public void setFee(double fee)规定学费的获取和查询、
  方法public void getshuishou(double pay)、public void setshuishou(double pay)规定税收获取费用和查询。try中列举了可能出现的错误，catch中为处理方式。
  
 
## 三、实验核心代码

接口实例化

      public void getFee(double fee){}
      public void setFee(double fee){}
      public void getPay(double pay){}
      public void setPay(double pay){}
税收计算      
      public void getshuishou(double pay) {}
成员变量定义      
      Scanner scanner = new Scanner(System.in)；
故障处理      
      try{}catch{}
      
##  四、实验结果
    程序运行
    
      你好:李   年龄：25岁    性别：男
      请输入你的工资：
      60000
      你的年收入为：60000.0
      你的收税为：21000.0
      请输入你的学费：
      4600
      你的学费为：4600.0

      你好:王   年龄：24岁    性别：女
      请输入你的工资：
      50000
      你的年收入为：50000.0
      你的收税为：15000.0
      请输入你的学费：
      0
      你的学费为：0.0
      学费不能为0
      
 ##  五、实验感想
 对于Scanner的使用很不熟练，希望在后续的学习中能熟练掌握；熟悉了接口实例化的过程，加深了印象。
      
  
  
  
