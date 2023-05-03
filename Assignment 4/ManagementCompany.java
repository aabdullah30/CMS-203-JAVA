package application;

public class ManagementCompany {
    private final int MAX_PROPERTY = 5;
    private final int MGMT_WIDTH = 10;
    private final int MGMT_DEPTH = 10;
    private String name;
    private String taxID;
    private double mgmFeePer;
    private Property[] properties;
    private Plot plot;

    // no-argument constructor
    public ManagementCompany() {
        this.name = "";
        this.taxID = "";
        this.mgmFeePer = 0.0;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    // constructor with arguments for name, taxID, and mgmFeePer
    public ManagementCompany(String name, String taxID, double mgmFeePer) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    // constructor with arguments for name, taxID, mgmFeePer, and plot
    public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeePer;
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
    }

    // copy constructor
    public ManagementCompany(ManagementCompany otherCompany) {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.plot = new Plot(otherCompany.plot);
        this.properties = new Property[MAX_PROPERTY];
        for (int i = 0; i < otherCompany.properties.length; i++) {
            if (otherCompany.properties[i] != null) {
                this.properties[i] = new Property(otherCompany.properties[i]);
            }
        }
    }

    public int addProperty(Property property) {
        if (property == null) {
            return -2;
        }
        if (!this.plot.encompasses(property.getPlot())) {
            return -3;
        }
        for (int i = 0; i < this.properties.length; i++) {
            if (this.properties[i] != null && this.properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
            if (this.properties[i] == null) {
                this.properties[i] = new Property(property);
                return i;
            }
        }
        return -1;
    }

    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(new Property(name, city, rent, owner));
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }

    public String displayPropertyAtIndex(int i) {
        if (i < 0 || i >= this.properties.length || this.properties[i] == null) {
            return "";
        }
        return this.properties[i].toString();
    }

    public int getMAX_PROPERTY() {
        return MAX_PROPERTY;
    }

    public double maxRentProp() {
        double maxRent = 0.0;
        for (Property property : this.properties) {
        	if (property != null && property.getRentAmount() > maxRent) {
        		maxRent = property.getRentAmount();
        		}
        		}
        		return maxRent;
        		}
    public String displayProperties() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.properties.length; i++) {
            if (this.properties[i] != null) {
                sb.append(this.properties[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public double totalRent() {
        double totalRent = 0.0;
        for (Property property : this.properties) {
            if (property != null) {
                totalRent += property.getRentAmount();
            }
        }
        return totalRent;
    }

    public int getRentPropertyCount(double rent) {
        int count = 0;
        for (Property property : this.properties) {
            if (property != null && property.getRentAmount() == rent) {
                count++;
            }
        }
        return count;
    }

    public Property[] getProperties() {
        return properties;
    }

    public Plot getPlot() {
        return plot;
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public double getMgmFeePer() {
        return mgmFeePer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public void setMgmFeePer(double mgmFeePer) {
        this.mgmFeePer = mgmFeePer;
    }
}
    