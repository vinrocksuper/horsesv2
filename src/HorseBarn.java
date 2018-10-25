public class HorseBarn {
    private Horse[] horses;

    public HorseBarn(Horse[] x) {
        this.horses = x;

    }

    public int findHorseSpace(String name) {
        int i = 0;
        for (Horse x : horses) {
            if (x != null && x.getName() == name) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < this.horses.length - 1; i++) {
            if (this.horses[i] == null) {
                for (int j = i + 1; j < this.horses.length; j++) {
                    if (this.horses[j] != null) {
                        this.horses[i] = this.horses[j];
                        this.horses[j] = null;
                        j = this.horses.length;
                    }
                }
            }
        }
    }
}
