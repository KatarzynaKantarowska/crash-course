package paradygmatyProgramowaniaObiektowego.ZadanieTelewizor.Philips;

public class P43PUS6523 extends TelewizorPhilips {


    private String hdmi1;
    private String usb1;

    public P43PUS6523(String id) {
        super(id,43);
    }

    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }

    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }

    @Override
    public void akcjaZasilania() {

    }
}
