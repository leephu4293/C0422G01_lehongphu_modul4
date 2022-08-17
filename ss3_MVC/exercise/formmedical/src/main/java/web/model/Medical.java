package web.model;

public class Medical {
    private String name;
    private String age;
    private String gender;
    private String nation;
    private String id;
    private String travel;
    private String travelNumber;
    private String travelSeats;
    private String dayStart;
    private String monthStart;
    private String yearStart;
    private String dayEnd;
    private String monthEnd;
    private String yearEnd;
    private String note;

    public Medical() {
    }

    public Medical(String name, String age, String gender, String nation, String id, String travel,
                   String travelNumber, String travelSeats, String dayStart, String monthStart,
                   String yearStart, String dayEnd, String monthEnd, String yearEnd, String note) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nation = nation;
        this.id = id;
        this.travel = travel;
        this.travelNumber = travelNumber;
        this.travelSeats = travelSeats;
        this.dayStart = dayStart;
        this.monthStart = monthStart;
        this.yearStart = yearStart;
        this.dayEnd = dayEnd;
        this.monthEnd = monthEnd;
        this.yearEnd = yearEnd;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getTravelNumber() {
        return travelNumber;
    }

    public void setTravelNumber(String travelNumber) {
        this.travelNumber = travelNumber;
    }

    public String getTravelSeats() {
        return travelSeats;
    }

    public void setTravelSeats(String travelSeats) {
        this.travelSeats = travelSeats;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(String monthStart) {
        this.monthStart = monthStart;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
