package Pen;

public class Pen {
    private IType type;
    private IStructure structure;
    private InkType ink;

    public Pen(IType type, IStructure structure, InkType ink) {
        this.type = type;
        this.structure = structure;
        this.ink = ink;
    }

    public void write(String text) {
        type.write(text, ink);
    }

    public void start() {
        structure.start();
    }

    public void stop() {
        structure.stop();
    }

    public void refill(InkType ink) {
        this.ink = ink;
        type.refill(ink);
    }
}
