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
    /*
    String item = "coffee";
    String size = "large";
    int quantity = 2;

    double price = 0;

    switch (item){
        case "coffee":
            price = 25.0;
            break;
        case "tea":
            price = 20.0;
            break;
        case "sandwich":
            price = 45.0;
            break;
        case "cake":
            price = 35.0;
            break;
        default:
            price = 0.0;
            System.out.println("invalid item");
    }

    if (item.equals("coffee") || item.equals("tea")){
        switch (size){
            case "small":
                price *= 1.0;
                break;
            case "medium":
                price *= 1.2;
                break;
            case "large":
                price *= 1.5;
                break;
            default:
                System.out.println("invalid size");
        }
    }

    System.out.println("ORDER:\nItem:" + item);
    if (item.equals("coffee") || item.equals("tea")){
        System.out.println("Size:" + size);
    }
    System.out.println("Price per item: " + price);
    System.out.println("Total price: " + (price * quantity));*/


    //While loops
    //opgave 18
    /*
    double money = 10000.0;    //måske float for mindre decimaler?
    int interest = 5;
    int years = 0;

    while (money < 20000.0){
        money = money + (money/100*interest);
        years++;
        System.out.println("Year " + years+ ": " + money);
    }
    System.out.println("Balance doubled in: " + years + " years.");*/


    //for loops
    //opgave 22
    /*
    for (int i = 0; i <= 30; i++){
        if (i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0){
            System.out.println("Fizz");
        }else if (i % 5 == 0){
            System.out.println("Buzz");
        }  else {
            System.out.println(i);
        }
    }*/


    //for loops med array
    //opgave 24
    /*
    int[] scores = {85,92,78,88,95,73,90};
    int sum = 0;
    int max = scores[0];
    int min = scores[0];
    int count = 0;

    for (int i = 0; i < scores.length; i++){
        sum += scores[i];
        if (max < scores[i]){
            max = scores[i];
        }
        if (min > scores[i]){
            min = scores[i];
        }
        if (scores[i] > 80){
            count++;
        }
    }
    System.out.println("Average score: " + (sum/ scores.length));
    System.out.println("Lowest score: " + min);
    System.out.println("Highest score: " + max);
    System.out.println("Number of scores above 80: " + count); */


    //For-each loops
    //opgave 29
    /*
    int[] stockLevels = {45,12,67,8,34,5,89};
    int needRestock = 0;

    for (int item : stockLevels) {
        if (item <= 10){
            needRestock++;
        }
    }
    System.out.println("Items in need of restock: " + needRestock); */
}
