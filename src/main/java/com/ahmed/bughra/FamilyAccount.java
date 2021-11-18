package com.ahmed.bughra;


class FamilyAccount{

    public static void main(String[] args){

        boolean isFlag = true;
        String details = "ئەھۋالى\t\tسوممىسى\t\tكىرىم \t\tچۈشەندۈرۈش\n";
        int balance = 10000;

        while(isFlag){

            System.out.println("-----------------ئائىلە كىرىم-چىقىم ھېسابلىغۇچ-----------------\n");
            System.out.println("                    1 كىرىم تەپسىلاتى");
            System.out.println("                    2 كىرىم خاتېرىلەش");
            System.out.println("                    3 چىقىم خاتېرىلەش");
            System.out.println("                    4 چېكىنىش \n");
            System.out.print("                    مەلۇم تاللاش نومۇرىنى كىرگۈزۈڭ(1-4)：");

            char selection = Utility.readMenuSelection();
            switch(selection){

                case '1':
                    System.out.println("-----------------نۆۋەتتىكى كىرىم-چىقىم ئەھۋالى-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2':
                    System.out.print("بۇ قېتىملىق كىرىمنى كىرگۈزۈڭ：");
                    int addMoney = Utility.readNumber();
                    System.out.print("بۇ قېتىمقى كىرىمنىڭ تەپسىلاتى：");
                    String addInfo = Utility.readString();

                    balance += addMoney;

                    details += ("كىرىم\t\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n");


                    System.out.println("---------------------خاتېرە قالدۇرۇلدى---------------------\n");
                    break;
                case '3':

                    System.out.print("بۇ قېتىمقى چىقىم سوممىسى：");
                    int minusMoney = Utility.readNumber();
                    System.out.print("چىقىمنىڭ چۈشەندۈرۈلۈشى：");
                    String minusInfo = Utility.readString();


                    if(balance >= minusMoney){
                        balance -= minusMoney;

                        details += ("چىقىم\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n");
                    }else{
                        System.out.println("چىقىمىڭىز نۆۋەتتىكى سوممىڭىزدىن ئېشىپ كەتتى.");
                    }

                    System.out.println("---------------------ساقلاش مۇۋاپپىقىيەتلىك بولدى---------------------\n");
                    break;
                case '4':
                    System.out.print("چىكىنىپ چىقىپ كېتەمسىز؟(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }
}
