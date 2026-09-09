void main(){
    //simple betingelser
    //opgave 1
    /*
    int discount = 20;
    int totalPrice = 1200;

    if (totalPrice > 1000){
        System.out.println("Discount!\nNew price: " + (totalPrice-((totalPrice/100)*discount)));
    } else {
        System.out.println("No discount :(");
    }*/

    //Betingelser med AND
    //opgave 2
    /*
    int time = 14;

    if (time > 5 && time < 11){
        System.out.println("Good morning");
    } else if (time > 12 && time < 17){
        System.out.println("Good afternoon");
    } else if (time > 18 && time < 21){
        System.out.println("Good evening");
    } else if (time > 22 && time < 4){
        System.out.println("Good night");
    }*/

    //Betingelser med OR
    //opgave 6
    /*
    int ageLimit = 15;
    int guestAge = 14;
    boolean hasParentConsent = true;

    if (guestAge > ageLimit || (guestAge > 13 && hasParentConsent)){
        System.out.println("Allowed to watch");
    } else {
        System.out.println("Not allowed to watch");
    }*/

    //Kombinerede operatorer
    //opgave 8
    /*
    double basePremium = 5000.0;
    double highRisk= 2000.0;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;
    int age = 22;

    if ((age < 25 || age > 70) || (hasAccidents && accidents > 2) || riskZone){
        System.out.println("High risk category\nAnnual premium: " + (basePremium + highRisk));
    } else {
        System.out.println("Normal risk category\nAnnual premium: " + basePremium);
    }*/

    //Switch case
    //opgave 14
    String[] products = {"coffee","tea","sandwich","cake"};
    double[] prices = {25.0,20.0,45.0,35.0};

}
