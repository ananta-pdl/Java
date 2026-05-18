//
///*
//switch(expression) {
//  case x:
//    // code block
//    break;
//  case y:
//    // code block
//    break;
//  default:
//    // code block
//}
//
//code ::
//int day = 4;
//switch (day) {
//  case 1:
//    System.out.println("Monday");
//    break;
//  case 2:
//    System.out.println("Tuesday");
//    break;
//  case 3:
//    System.out.println("Wednesday");
//    break;
//  case 4:
//    System.out.println("Thursday");
//    break;
//  case 5:
//    System.out.println("Friday");
//    break;
//  case 6:
//    System.out.println("Saturday");
//    break;
//  case 7:
//    System.out.println("Sunday");
//    break;
//}
//// Outputs "Thursday" (day 4)
// */
//
//package Week3;
//
//public class SwitchExample {
//    static void main(String[] argu) {
//        //switch statement
//
//        int statuscode=200;
//
//        switch (statuscode){
//            case=500:
//                System.out.printf("Internal server arrar");
//                break;
//            case=200:
//                System.out.printf("Success response");
//                break;
//            case=400:
//                System.out.printf("Validation error");
//                break;
//            default:
//                System.out.printf("Invalid Status");
//
//        }
//        switch (statuscode) {
//            case 500 -> System.out.printf("Internal server arrar");
//            case 200 -> System.out.printf("Success response");
//            case 400 -> System.out.printf("Validation error");
//            default -> System.out.printf("Invalid Status");
//
//        }
//        String result="";
//        switch (statuscode) {
//            case 500 -> result = "Internal server arrar";
//            case 200 -> result = "Success response";
//            case 400 -> result = "Validation error";
//            default -> result = "Invalid Status";
//        }
//        System.out.printf(result);
//
//        String result2=switch (statuscode) {
//            case 500 -> "Internal server arrar";
//            case 200 ->  "Success response";
//            case 400 ->  "Validation error";
//            default ->  "Invalid Status";
//        };
//        System.out.printf(result2);
//    }
//}
//}
//
//
//
