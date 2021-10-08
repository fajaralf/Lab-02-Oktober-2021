public class person{

    String name, birthdate, departement, major;
    int age, height, weight;
    Double distance, time;

    static void identitas(){

        person test = new person();
        test.setName("Fajar Alfiantino"); //set value
        String name = test.getName();
        System.out.println(name);

        test.setBirthdate("15 Desember 2002");
        String birthdate = test.getBirthdate();
        System.out.println(birthdate);

        test.setDepartement("Informatika & Pariwisata");
        String departement = test.getDepartement();
        System.out.println(departement);

        test.setMajor("Teknologi Informasi");
        String major = test.getMajor();
        System.out.println(major);

        test.setAge(19);
        int age = test.getAge();
        System.out.println("Umur: " + age + " Tahun");

        test.setHeight(165);
        int height = test.getHeight();
        System.out.println("Tinggi Badan: " + height + " cm");

        test.setWeight(55);
        int weight = test.getWeight();
        System.out.println("Berat Badan: " + weight + " kg");

    }

    static void waktutempuh(){

        person test = new person();

        test.setDistance((double) 15);
        double distance = test.getDistance();
        System.out.println("Jarak: " + distance + " km");

        test.setTime(+distance);
        double time = test.getTime();
        System.out.println("Waktu Tempuh: "+ time + " Jam");

    }
    public static void main (String args[]){
        identitas();
        waktutempuh();
    }

    public void setName(String x){ //sett value
        this.name = "Nama: " + x;
    }
    public String getName(){ //get = mengambil nilai value yg sudah di set
        return this.name;
    }

    public void setBirthdate(String x){
        this.birthdate = "Tanggal Lahir: " + x;
    }
    public String getBirthdate(){
        return this.birthdate;
    }

    public void setDepartement(String x){
        this.departement = "Fakultas: " + x;
    }
    public String getDepartement(){
        return this.departement;
    }
    
    public void setMajor(String x){
        this.major = "Jurusan: " + x;
    }
    public String getMajor(){
        return this.major;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

    public void setDistance(Double distance){
        this.distance = distance;
    }
    public Double getDistance(){
        return this.distance;
    }

    public void setTime(double distance){
        int kecepatan = 80;
        this.time = distance / kecepatan;
    }
    public Double getTime(){
        return this.time;
    }
}
