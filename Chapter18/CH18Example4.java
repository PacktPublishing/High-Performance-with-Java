// Anomaly Detector
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class CH18Example4 {
    public static void main(String[] args) throws Exception {
        MultiLayerNetwork model = ModelSerializer.restoreMultiLayerNetwork("path/my_anomaly_model.zip");

        double[] performanceMetrics = {75.0, 85.7, 500, 150}; 
        INDArray input = Nd4j.create(performanceMetrics);

        INDArray output = model.output(input);
        double anomalyScore = output.getDouble(0);

        System.out.println("Anomaly Detector Report (ADSR): Anomaly Score: " + anomalyScore);

        if (anomalyScore > 0.3) {
            System.out.println("Anomaly Detector Report (ADSR): Anomaly detected!");
        } else {
            System.out.println("Anomaly Detector Report (ADSR): System is operating normally.");
        }
    }
}
