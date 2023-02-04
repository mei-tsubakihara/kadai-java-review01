package jp.co.kiramex.company.entity;

public class Employee {
    // フィールド
    private int employeeId; //社員ID
    private String employeeName; //社員名
    private String divisionName; //部署名
    private int vitality; //体力

    //コンストラクタ
    public Employee() {
    }

    //引数ありコンストラクタ
    //public Employee(String employeeName, String divisionName, int vitality) {
    public Employee(int employeeId, String employeeName, String divisionName, int vitality) {
    //System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    //自己紹介メソッド
    public void introduce() {
        vitality = vitality - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    //挨拶をするメソッド
    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }

    //挨拶をするメソッド、オーバーロード
    public void greeting(String divisionName) {
        vitality = vitality - 10;
        System.out.println(divisionName + "の皆さん、おはようございます");
    }

    //残り体力を知らせるメソッド
    public void vitality() {
        System.out.println("残り体力は" + vitality);
        }
}
