public class EmployeeBook {
    private Employee[] employee = new Employee[10];

    public void getAllEmployeeInfo() {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] != null) {
                System.out.println(this.employee[i]);
            }
        }
    }

    public int getSumSalary() {
        int sum = 0;
        for (int i = 0; i < this.employee.length; i++) {
            sum += this.employee[i].getSalary();
        }
        return sum;
    }

    public int getSumSalaryByDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getDepartment() == department) {
                sum += this.employee[i].getSalary();
            }
        }
        return sum;
    }

    public Employee getMinSalary() {
        Employee employeeMinSalary = this.employee[0];
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = this.employee[i];
            }
        }
        return employeeMinSalary;
    }

    public Employee getMinSalaryByDepartment(int department) {
        Employee employeeMinSalary = this.employee[0];
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() < employeeMinSalary.getSalary() && this.employee[i].getDepartment() == department) {
                employeeMinSalary = this.employee[i];
            }
        }
        return employeeMinSalary;
    }

    public Employee getMaxSalary() {
        Employee employeeMaxSalary = this.employee[0];
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = this.employee[i];
            }
        }
        return employeeMaxSalary;
    }

    public Employee getMaxSalaryByDepartment(int department) {
        Employee employeeMaxSalary = this.employee[0];
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() < employeeMaxSalary.getSalary() && this.employee[i].getDepartment() == department) {
                employeeMaxSalary = this.employee[i];
            }
        }
        return employeeMaxSalary;
    }

    public int getAverageSalary() {
        return getSumSalary() / this.employee.length;
    }

    public int getAverageSalaryByDepartment(int department) {
        int cnt = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getDepartment() == department) {
                cnt++;
            }
        }
        return getSumSalaryByDepartment(department) / cnt;
    }

    public void getWorkersFullName() {
        for (int i = 0; i < this.employee.length; i++) {
            System.out.println(this.employee[i].getFullName());
        }
    }

    public void changeSalary(int percent) {
        for (int i = 0; i < this.employee.length; i++) {
            this.employee[i].setSalary(this.employee[i].getSalary() + (this.employee[i].getSalary() * percent / 100));
        }
    }

    public void changeSalaryByDepartment(int percent, int department) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getDepartment() == department) {
                this.employee[i].setSalary(this.employee[i].getSalary() + (this.employee[i].getSalary() * percent / 100));
            }
        }
    }

    public void getWorkersBytDepartment(int department) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getDepartment() == department) {
                System.out.println(this.employee[i].getId() + "\n" + this.employee[i].getFullName() + "\n" + this.employee[i].getSalary());
                System.out.println("-------------------------------------------");
            }
        }
    }

    public void getLessSalary(int currentSalary) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() < currentSalary) {
                System.out.println(this.employee[i].getId() + "\n" + this.employee[i].getFullName() + "\n" + this.employee[i].getSalary());
                System.out.println("-------------------------------------------");
            }
        }
    }

    public void getMoreSalary(int currentSalary) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getSalary() > currentSalary) {
                System.out.println(this.employee[i].getId() + "\n" + this.employee[i].getFullName() + "\n" + this.employee[i].getSalary());
                System.out.println("-------------------------------------------");
            }
        }
    }

    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] == null) {
                this.employee[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i].getId() == id) {
                this.employee[i] = null;
                return true;
            }
        }
        return false;
    }
    public Employee getEmployeeById(int id) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] != null) {
                if (this.employee[i].getId() == id) {
                    return this.employee[i];
                }
            }
        }
        return null;
    }
}
