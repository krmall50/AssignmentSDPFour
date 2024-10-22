public class SetVolume implements Command {
    private Stereo stereo;
    private int volume;
    public SetVolume(Stereo stereo, int volume){
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void execute() {
        stereo.setVolume(volume);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
    }
}
