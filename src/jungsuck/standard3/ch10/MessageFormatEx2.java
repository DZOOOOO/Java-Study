package jungsuck.standard3.ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', {2}, ''{3}'')";

        Object[][] arguments = {
                {"이자바", "02-123-1234", "27", "07-08"},
                {"김프로", "032-333-1234", "33", "10-07"}
        };

        for (int i = 0; i < arguments.length; i++) {
            MessageFormat form = new MessageFormat(msg);
            String str = form.format(arguments[i]);
            System.out.println(str);
        }
    }
}
