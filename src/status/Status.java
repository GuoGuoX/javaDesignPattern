package status;

public interface Status {
    void handler();
}
class FreeStatus implements Status{

    @Override
    public void handler() {
        System.out.println("该房间为空闲、、、");
    }
}
class BookedStatus implements Status{

    @Override
    public void handler() {
        System.out.println("该房间已被预订~！！！！");
    }
}
class CheckedStatus implements Status{

    @Override
    public void handler() {
        System.out.println("该房间清理中~~~~~~~");
    }
}

