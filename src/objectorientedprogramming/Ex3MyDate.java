package objectorientedprogramming;

public class Ex3MyDate {
	private int day, month, year;
	private boolean isValid = true;
	private int maxDay[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int leap_MaxDay[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Ex3MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		isValid();
	}

	public boolean isValid() {
		if (this.year < 0) {
			this.isValid = false;
		} else if (this.month < 0 || this.month > 12) {
			this.isValid = false;
		} else if (true) {
			if (isLeapYear(this.year)) {
				if (this.day > leap_MaxDay[this.month - 1] || this.day < 1) {
					this.isValid = false;
				}else {
					this.isValid = true;
				}
			} else {
				if (this.day > maxDay[this.month - 1] || this.day < 1) {
					this.isValid = false;
				}else {
					this.isValid = true;
				}
			}
		}

		if (this.isValid) {
			System.out.println("이 날짜는 유효합니다.");
		} else {
			System.out.println("이 날짜는 유효하지 않습니다.");
		}
		return this.isValid;
	}

	public boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월  " + day + "일");
		} else {
			System.out.println(year + "년 " + month + "월  " + day + "일");
			System.out.println("날짜를 다시 입력해주세요");
		}
	}

	public void setDay(int day) {
		this.day = day;
		isValid();
	}

	public void setMonth(int month) {
		this.month = month;
		isValid();
	}

	public void setYear(int year) {
		this.year = year;
		isValid();
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

}
