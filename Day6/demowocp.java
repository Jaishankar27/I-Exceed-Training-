abstract class PaymentMethod
  {
     abstract public double paymentProcess(double amount);
  }


class creditcard extends PaymentMethod
 {
     @Override
     public double paymentProcess(double amount)
     {
        return amount*=.10;
     }
 }

class debitcard extends PaymentMethod
 {
     @Override
     public double paymentProcess(double amount)
     {
        return amount*=.12;
     }
 }

 class UPI extends PaymentMethod
 {
     @Override
     public double paymentProcess(double amount)
       {
          return amount*=.15;
       }
 }

class paymentprocess
 {
     public double processType(PaymentMethod method,double amount)
       {
            return method.paymentProcess(amount);  
       }
  }

class demowocp
 {
   public static void main(String asd[])
     {
        PaymentMethod cc=new creditcard();
        PaymentMethod dc=new debitcard();
        PaymentMethod upi=new UPI();
        //paymentprocess po=new paymentprocess();
        System.out.println(upi.paymentProcess(10000));

     }
 }