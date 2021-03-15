import java.time.LocalDate;
import java.time.Period;

class HeartRates {
    private String name;
    private String lastName;
    private LocalDate birthday;
    private int years;
    LocalDate now = LocalDate.now();
    private double HeartRates;
    private double minHeartRates;
    private double maxHeartRates;

    public HeartRates(String iName, String iLastName, int year, int month, int day) {
        setName(iName);
        setLastName(iLastName);
        setBirthDay(LocalDate.of(year, month, day));
        years = Period.between(birthday, now).getYears();
        setHeartRates(220 - years);
        setMinHeartRates(HeartRates * 0.50);
        setMaxHeartRates(HeartRates * 0.85);
    }

    public void status() {
        System.out.println("Your name is " + this.name + " " + this.lastName + " Your Bithday is "
                + this.birthday.toString() + " And you Have " + this.years + " Years");
        System.out.println("Your Heart Rate is betwenn " + minHeartRates + " And " + maxHeartRates);
    }

    public double getMaxHeartRates() {
        return maxHeartRates;
    }

    public void setMaxHeartRates(double maxHeartRates) {
        this.maxHeartRates = maxHeartRates;
    }

    public double getMinHeartRates() {
        return minHeartRates;
    }

    public void setMinHeartRates(double minHeartRates) {
        this.minHeartRates = minHeartRates;
    }

    public double getHeartRates() {
        return HeartRates;
    }

    public void setHeartRates(double heartRates) {
        this.HeartRates = heartRates;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public LocalDate getBornDay() {
        return birthday;
    }

    public void setBirthDay(LocalDate bornDay) {
        this.birthday = bornDay;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
}