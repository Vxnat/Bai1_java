package View;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class AmThanhGame {
    public void amThanhXocDia() {
        String wavFile = "C:\\FileAmThanhGame\\SoundXD.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	
        }
    public void amThanhTien() {
        String wavFile = "C:\\FileAmThanhGame\\Money.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void amThanhThua() {
        String wavFile = "C:\\FileAmThanhGame\\Thua.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void amThanhQuayMayMan() {
        String wavFile = "C:\\FileAmThanhGame\\SOXO.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void amThanhError() {
        String wavFile = "C:\\FileAmThanhGame\\TatVoMom.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	
        }
    public void amThanhDatCuoc() {
        String wavFile = "C:\\FileAmThanhGame\\DatCuoc.wav";

        try {
            // Tạo một AudioInputStream từ file WAV
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new java.io.File(wavFile));

            // Lấy thông tin về định dạng âm thanh
            AudioFormat audioFormat = audioInputStream.getFormat();

            // Tạo một DataLine.Info object để lấy thông tin về Line phù hợp để phát lại âm thanh
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);

            // Lấy Line phù hợp từ DataLine.Info
            SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem.getLine(dataLineInfo);

            // Mở Line để bắt đầu phát lại âm thanh
            sourceDataLine.open(audioFormat);
            sourceDataLine.start();

            // Đọc và phát lại dữ liệu âm thanh từ AudioInputStream
            byte[] audioData = new byte[2048];
            int bytesRead = 0;
            while (bytesRead != -1) {
                bytesRead = audioInputStream.read(audioData, 0, audioData.length);
                if (bytesRead >= 0) {
                    sourceDataLine.write(audioData, 0, bytesRead);
                }
            }

            // Dừng và đóng Line khi hoàn thành
            sourceDataLine.drain();
            sourceDataLine.stop();
            sourceDataLine.close();

            // Đóng AudioInputStream khi hoàn thành
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	
        }
}
