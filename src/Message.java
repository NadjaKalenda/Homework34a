public class Message<S,V> {

private V newObjekt;

    public V getNewObjekt() {
        return newObjekt;

    }

    public void setNewObjekt(V newObjekt) {
        this.newObjekt = newObjekt;
    }

    private S objekt;

    public S getObjekkt() {
        return objekt;
    }

    public void setObjekt(S objekt) {
        this.objekt = objekt;
    }

    public Message(S objekt) {
        this.objekt = objekt;
    }
}




//1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
//        2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе, тип которого будет является дженериком
//3. Создайте приложение, которое спрашивает у пользователя, что положить в Message.
//        3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
//3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число