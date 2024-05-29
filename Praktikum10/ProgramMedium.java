import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truk truck = new Truk(10000);
        System.out.println(truck);

        SeaPlane seaPlane = new SeaPlane(5000);
        System.out.println(seaPlane);

        Helicopter copter = new Helicopter(3000);
        System.out.println(copter);

        List<Truk> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(seaPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("############################");

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>();
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

    }
}
