package application;

public class Plot {
    
    // Fields
    private int x;
    private int y;
    private int width;
    private int depth;
    
    // Constructors
    public Plot() {
        this(0, 0, 1, 1);
    }
    
    public Plot(Plot p) {
        this(p.x, p.y, p.width, p.depth);
    }
    
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    
    // Methods
    public boolean overlaps(Plot plot) {
        // Check if this plot overlaps with the given plot
        return (this.x < plot.x + plot.width && 
                this.x + this.width > plot.x && 
                this.y < plot.y + plot.depth && 
                this.y + this.depth > plot.y);
    }
    
    public boolean encompasses(Plot plot) {
        // Check if this plot encompasses the given plot
        return (plot.x >= this.x && 
                plot.x + plot.width <= this.x + this.width && 
                plot.y >= this.y && 
                plot.y + plot.depth <= this.y + this.depth);
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getDepth() {
        return depth;
    }
    
    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    @Override
    public String toString() {
        return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
    }
}