package org.dhana.day2.switchadv;

public class SwitchEnum {
    public static void main(String[] args) {
        var status = Status.ACTIVE;
        switch (status) {
            case ACTIVE -> System.out.println(String.format("""
                    Code is %d
                    Description is %s
                    """, status.getCode(), status.getDescription()));
            case PENDING -> System.out.println(status.name());
        }
    }
}