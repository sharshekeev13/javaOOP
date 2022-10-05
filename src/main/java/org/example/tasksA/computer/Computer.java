package org.example.tasksA.computer;

public class Computer implements ComputerInterface {
    private String name;
    private String model;
    private String typeOS;
    private String manufacturer;
    private HDD hardDisk;
    private CD_ROM cd_rom;
    private RAM ram;
    private Processor processor;

    public Computer (String name, String model, String typeOS) {
        this.name = name;
        this.model = model;
        this.typeOS = typeOS;
    }

    public void virusTest () {
        String  capacityOfHDD = hardDisk.getCapacity();

        if (this.typeOS.equals("Windows")) {
            System.out.println("HDD (" + capacityOfHDD + ") was chacked. There is a danger of the viruses!");
        } else {
            System.out.println("HDD (" + capacityOfHDD + ") was chacked. There is no danger in the system");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public HDD getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HDD hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CD_ROM getCd_rom() {
        return cd_rom;
    }

    public void setCd_rom(CD_ROM cd_rom) {
        this.cd_rom = cd_rom;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}