import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCurrentRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(7);

        int expected = 7;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

       @Test
    public void shouldCurrentRadioStationUnderMin() {
        Radio service = new Radio();
        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentRadioStationAboveMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationUnderMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(7);
        service.next();

        int expected = 8;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationAboveMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);
        service.next();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationAboveMin() {
        Radio service = new Radio();
        service.setCurrentRadioStation(8);
        service.prev();

        int expected = 7;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationUnderMin() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);
        service.prev();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(70);

        int expected = 70;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeUnderMin() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio service = new Radio();
        service.setCurrentVolume(101);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUnderMax() {
        Radio service = new Radio();
        service.setCurrentVolume(70);
        service.increaseVolume();

        int expected = 71;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMin() {
        Radio service = new Radio();
        service.setCurrentVolume(70);
        service.decreaseVolume();

        int expected = 69;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}