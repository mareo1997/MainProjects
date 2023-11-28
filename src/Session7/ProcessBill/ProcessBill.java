package Session7.ProcessBill;

import Session7.Menu;

import java.util.Map;
import java.util.Scanner;

public interface ProcessBill {

    Map<String, Double> Bill(Menu menu, Scanner in);

}
