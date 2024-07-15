
package DBPractice;


public class Test {
    public static void main(String[]args){
        ConnectionDB dbc = new DataOperation();
        
        //dbc.getConnection();
        //dbc.select(123);
        dbc.update(1);
    }
}
