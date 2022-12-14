public class Task1 {
    public static void main(String[] args) {
        //Task1
        {
            String str1 = "Hello world!";
            String str2 = "Hello";

            if (str1.contains(str2)) {
                System.out.println("Строка \"" + str2 + "\"" + " содержиться в строке \"" + str1 + "\"");
            } else {
                System.out.println("Строка \"" + str2 + "\"" + " не содержиться в строке \"" + str1 + "\"");
            }
        }

        //Task2
        {
            String str1 = "abc";
            String str2 = "cba";

            boolean result = str1.length() == str2.length();
            if (result) {
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != str2.charAt(str2.length() - i - 1)) {
                        result = false;
                        break;
                    }
                }
            }
            if (result) {
                System.out.println("Строка \"" + str1 + "\"" + " является зеркальным отражением строки \"" + str2 + "\"");
            } else {
                System.out.println("Строка \"" + str1 + "\"" + " не является зеркальным отражением строки \"" + str2 + "\"");
            }
        }

        //Task3
        {
            String str1 = "Test";
            String str2 = reverseString(str1);
            System.out.println("Зеркальным отображением строки \"" + str1 + "\"" + " является \"" + str2 + "\"");

        }

        //Task4
        {
            int i1 = 3;
            int i2 = 56;
            StringBuilder builder = new StringBuilder();
            builder.append(i1)
                    .append("+")
                    .append(i2)
                    .append("=")
                    .append(i1 + i2)
                    .append(";")
                    .append(i1)
                    .append("-")
                    .append(i2)
                    .append("=")
                    .append(i1 - i2)
                    .append(";")
                    .append(i1)
                    .append("*")
                    .append(i2)
                    .append("=")
                    .append(i1 * i2);

            System.out.println(builder);
        }

        //Task5
        {
            StringBuilder str = new StringBuilder("Смелость=отвага");
            int i = str.indexOf("=");
            str.deleteCharAt(i);
            str.insert(i, " равно ");
            System.out.println(str);
        }

        //Task6
        {
            StringBuilder str_1 = new StringBuilder("Отвага=смелость");
            int i = str_1.indexOf("=");
            str_1.replace(i, (i + 1), " равно ");
            System.out.println(str_1);
        }

        //Task7
        {
            String str1 = "";
            for (int i = 0; i < 10001; i++) {
                str1=str1.concat("=");
            }
            String str2 = str1;
            System.out.println(str1);

            long t1 = System.currentTimeMillis();
            String res = str1.replace("=", "равно");
            long t2 = System.currentTimeMillis();
            System.out.println(t2 - t1);
            System.out.println(res);

            StringBuilder str_1 = new StringBuilder(str2);
            System.out.println(str_1);
            long t3 = System.currentTimeMillis();
            while (str_1.indexOf("=") > -1) {
                int i = str_1.indexOf("=");
                str_1.replace(i, (i + 1), "равно");
            }
            long t4 = System.currentTimeMillis();
            System.out.println(t4 - t3);
            System.out.println(str_1);

        }
    }

    public static String reverseString(String s) {
        if(s.isEmpty())
        {
            return s;
        }
        else
        {
            return reverseString(s.substring(1))+s.charAt(0);
        }
    }
}
