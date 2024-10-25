public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element element) {
        // Leaf Element, does nothing
    }

    @Override
    public void remove(Element element) {
        //Leaf Element, does nothing
    }

    @Override
    public Element get(int index) {
        return null; //Leaf Element, does nothing
    }
}
