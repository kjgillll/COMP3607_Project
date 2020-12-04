/** 
 * The Visitor Inteface declares a set of visiting methods that can take
 * Student Objects as an argument.
 */
public interface Visitor {
    public void visit(StudentIT student); 
    public void visit(StudentCS student);  
}//end Vistor()
