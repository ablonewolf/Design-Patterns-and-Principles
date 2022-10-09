package DelegationPrinciples;

public class Printer {
//    the delegator
   private RealPrinter printer = new RealPrinter();
    public void print() {
        printer.print();
    }
}
