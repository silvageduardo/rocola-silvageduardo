package ar.edu.unahur.obj2.tp1;

import java.util.Objects;

public class Genero {
    private String rock;
    private String pop;
    private String hip_hop;
    private String trap;
    private String clasico;
    private String folk;

    public Genero(String rock, String pop, String hip_hop, String trap, String clasico, String folk) {
        this.rock = rock;
        this.pop = pop;
        this.hip_hop = hip_hop;
        this.trap = trap;
        this.clasico = clasico;
        this.folk = folk;
    }

    public String getRock() {
        return rock;
    }

    public String getPop() {
        return pop;
    }

    public String getHip_hop() {
        return hip_hop;
    }

    public String getTrap() {
        return trap;
    }

    public String getClasico() {
        return clasico;
    }

    public String getFolk() {
        return folk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Genero)) return false;
        Genero genero = (Genero) o;
        return Objects.equals(getRock(), genero.getRock()) &&
                Objects.equals(getPop(), genero.getPop()) &&
                Objects.equals(getHip_hop(), genero.getHip_hop()) &&
                Objects.equals(getTrap(), genero.getTrap()) &&
                Objects.equals(getClasico(), genero.getClasico()) &&
                Objects.equals(getFolk(), genero.getFolk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRock(), getPop(), getHip_hop(), getTrap(), getClasico(), getFolk());
    }

    @Override
    public String toString() {
        return "Genero{" +
                "rock='" + rock + '\'' +
                ", pop='" + pop + '\'' +
                ", hip_hop='" + hip_hop + '\'' +
                ", trap='" + trap + '\'' +
                ", clasico='" + clasico + '\'' +
                ", folk='" + folk + '\'' +
                '}';
    }
}
