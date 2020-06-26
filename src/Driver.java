public class Driver {
    public static void main(String[] args) {
        Set s = new Set(10);
        s.Add(5);
        s.Add(5);
        s.Add(5);
        s.Add(3);
        s.Add(5);
        s.Add(1);
        s.Add(6);
        s.Add(15);
        s.Add(150);
        s.Add(151);
        s.Add(105);
        s.Add(159);
        s.Add(1500);
        s.Add(125);
        s.Add(1512);
        s.display();
        s.sort();
        s.display();
        s.update(5,9);
        s.display();
        s.update(6,8);
        s.display();

        s.delete(30);
        s.display();
    }
}
