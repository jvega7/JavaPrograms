//Paranoia
//
//This assignment describes a situation in a company.
//ByteCorp is a famous technological company in Byteania.
//The CEO of ByteCorp doesn't trust anyone and thinks that his accountant managed to move huge amounts of money to a
// competitor company, MegaCorp.
//He hires a computer crime investigator, and asks him to find inconsistencies in the money transfers.

//Here is a sample transaction log of the company:
//Feb SLR 4 M
//Feb ENT 800 K
//Mar SLR 4000 K
//Mar ENT 800 K
//Apr SLR 4010 K
//Apr ENT 810 K
//
//There are four columns:
//1. Month of the transaction
//2. Reason of the expense (SLR for "salary", ENT for "entertainment", OTR for "other")
//3. Amount
//4. M, K, or B (M for million, K for thousands, B for billion)
//
//In the example above, April expenses show an inconsistency and should be reported.
//
//Another example:
//Jul SLR 4 M
//Jul ENR 800 K
//Jul OTR 1200 K
//Aug SLR 4000 K
//Aug ENR 800 K
//Aug OTR 1190 K
//Sep SLR 4000 K
//Sep ENR 800 K
//Sep OTR 1190 K
//
//Here, July expenses show an inconsistency and should be reported..
//
//As the computer investigator,
// write a program, which reads the transaction logs,
// detects inconsistent expenses and
// prints the exact month containing the "unusual" activities.


import java.util.ArrayList;
import java.util.List;



//ArrayList
public class Paranoia {
            private String month;
            private String transaction;
            private int amount;
            private char usd;

    //object
    Paranoia(String month,String transaction, int amount, char usd ){
        this.month=month;
        this.transaction=transaction;
        this.amount=amount;
        this.usd=usd;

    }

    public String getMonth(){
        return month;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String getTransaction(){
        return transaction;
    }
    public void setTransaction(String transaction){
        this.transaction = transaction;
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public char getUsd(){
        return usd;
    }
    public void setUsd(char usd){
        this.usd = usd;
    }



    Paranoia(){
                //
                List<Paranoia> companyTransaction2 = new ArrayList<>();
                companyTransaction2.add(new Paranoia("Jul","SLR",4,'M'));
                companyTransaction2.add(new Paranoia("Jul","ENT",800,'K'));
                companyTransaction2.add(new Paranoia("Jul","OTR",1200,'K'));
                companyTransaction2.add(new Paranoia("Aug","SLR",4000,'K'));
                companyTransaction2.add(new Paranoia("Aug","ENR",800,'K'));
                companyTransaction2.add(new Paranoia("Aug","OTR",1190,'K'));
                companyTransaction2.add(new Paranoia("Sep","SLR",4000,'K'));
                companyTransaction2.add(new Paranoia("Sep","ENR",800,'K'));
                companyTransaction2.add(new Paranoia("Sep","OTR",1190,'K'));


        //First list of company transactions
                List<Paranoia> companyTransaction1 = new ArrayList<>();
                companyTransaction1.add(new Paranoia("Feb","SLR",4,'M'));
                companyTransaction1.add(new Paranoia("Feb","ENT",800,'K'));
                companyTransaction1.add(new Paranoia("Mar","SLR",4000,'K'));
                companyTransaction1.add(new Paranoia("Mar","ENT",800,'K'));
                companyTransaction1.add(new Paranoia("Apr","SLR",4010,'K'));
                companyTransaction1.add(new Paranoia("Apr","ENT",810,'K'));
                //Base line to compare transactions
                List<Paranoia> companyTransactionBaseLine = new ArrayList<>();
                companyTransactionBaseLine.add(new Paranoia("Default","ENT",800,'K'));
                companyTransactionBaseLine.add(new Paranoia("Default","SLR",4000,'K'));
                companyTransactionBaseLine.add(new Paranoia("Default","SLR",4,'M'));
                companyTransactionBaseLine.add(new Paranoia("Default","OTR",1200,'K'));

                boolean ans;
                //CHeck companyTransaction1
                for (int x = 0; x<companyTransaction1.size(); x++){

                    switch (companyTransaction1.get(x).getTransaction()){
                        case "ENT": if(companyTransactionBaseLine.get(0).getAmount()!=companyTransaction1.get(x).getAmount()){
                            System.out.println(companyTransaction1.get(x).getMonth()+" expenses show an inconsistency");
                        }
                            break;
                        case "SLR": if(companyTransactionBaseLine.get(1).getAmount()!=companyTransaction1.get(x).getAmount() &&
                                companyTransactionBaseLine.get(2).getAmount()!=companyTransaction1.get(x).getAmount()) {
                            System.out.println(companyTransaction1.get(x).getMonth() + " expenses show an inconsistency");
                        }
                            break;
                        case "OTR":  if(companyTransactionBaseLine.get(3).getAmount()!=companyTransaction1.get(x).getAmount()) {
                            System.out.println(companyTransaction1.get(x).getMonth() + " expenses show an inconsistency");
                        }
                            break;
                    }
                }

                //Check Tranaction2
                for (int x = 0; x<companyTransaction2.size(); x++){

                    switch (companyTransaction2.get(x).getTransaction()){
                        case "ENT": if(companyTransactionBaseLine.get(0).getAmount()!=companyTransaction2.get(x).getAmount()) {
                            System.out.println(companyTransaction2.get(x).getMonth() + " expenses show an inconsistency");
                        }
                            break;
                        case "SLR": if(companyTransactionBaseLine.get(1).getAmount()!=companyTransaction2.get(x).getAmount() &&
                                companyTransactionBaseLine.get(2).getAmount()!=companyTransaction2.get(x).getAmount()) {
                            System.out.println(companyTransaction2.get(x).getMonth() + " expenses show an inconsistency");
                         }
                            break;
                        case "OTR":  if(companyTransactionBaseLine.get(3).getAmount()!=companyTransaction2.get(x).getAmount()) {
                            System.out.println(companyTransaction2.get(x).getMonth() + " expenses show an inconsistency");
                        }
                            break;
                    }
                 }


    }





}
