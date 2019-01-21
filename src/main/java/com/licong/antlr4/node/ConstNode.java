package com.licong.antlr4.node;

import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by vime on 2015/12/11.
 */
public class ConstNode implements StrategyNode {
    private Object value;

    public ConstNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == null)
            return "null";
        if (value instanceof String) {
            String s = value.toString();
            s = s.replace("'", "\\'");
            s = s.replace("\b", "\\b");
            s = s.replace("\t", "\\t");
            s = s.replace("\n", "\\n");
            s = s.replace("\r", "\\r");

            return "'" + s + "'";
        }
        if (value instanceof Date) {
            Calendar calendar = Calendar.getInstance();
            Date date = (Date) value;
            calendar.setTime(date);
            String s = DatatypeConverter.printDateTime(calendar);
            return s;
//            Calendar c = calendar;
//            c.setTime(date);
//            return ISO8601Utils.format(date, c.get(Calendar.MILLISECOND) > 0);
        }
        return value.toString();
    }
}
