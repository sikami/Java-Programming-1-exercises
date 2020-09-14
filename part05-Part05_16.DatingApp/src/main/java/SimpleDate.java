
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        int value = 1;
        if (this.day == 30) {
            addValue();
        } else {
            this.day += value;
        }
    }
    
    public void advanceMore() {
        int value = 1;

        if (isLeapYear(this.year)) {

            if (oddMonth(this.month)) {
                if (this.day == 31) {
                    addValue();
                } else {
                    this.day += value;
                }
            } else if (this.month == 2) {
                if (this.day == 29) {
                    addValue();
                } else {
                    this.day += value;
                }
            } else {
                if (this.day == 30) {
                    addValue();
                } else {
                    this.day += value;
                }
            }

        } else {

            if (oddMonth(this.month)) {
                if (this.day == 31) {
                    addValue();
                } else {
                    this.day += value;
                }
            } else if (this.month == 2) {
                if (this.day == 28) {
                    addValue();
                } else {
                    this.day += value;
                }
            } else {
                if (this.day == 30) {
                    addValue();
                } else {
                    this.day += value;
                }
            }
        }
    }

        public boolean isLeapYear(int year){

            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 100 == 0 && year % 400 == 0 && year % 4 != 0) {
                return true;
            } else if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean oddMonth(int number) {
            int[] oddMonth = {1,3,5,7,8,10};
            for (int month : oddMonth) {
                if(month == number) {
                    return true;
                }
            }
            return false;
        }
        
        public void advance(int howManyDays) {

        for (int i = 0; i < howManyDays; i++) {
            advance();
        }

    }
        
        public void addValue() {
        int value = 1;
        this.month += value;
        this.day = value;

        if (this.month > 12) {
            this.month = value;
            this.year += value;
        }
    }
        
        public SimpleDate afterNumberOfDays(int days) {
            SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
            newDate.advance(days);
            return newDate;
        }
}
            
