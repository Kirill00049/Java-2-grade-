package ENUM;

import static ENUM.Marka.*;

public class MAIN {

    public static void main(String[] args) {

        Computer[] comp = {
                new Memory(Hyperx,"black",546,"memory"),
                new Monitor(LEN,"white",256,"monitor"),
                new Processor(ASUS,"grey",5467,"processor")
        };

        new all().print(comp);
    }

}

