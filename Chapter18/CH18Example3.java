import weka.classifiers.Classifier;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class CH18Example3 {
    public static void main(String[] args) throws Exception {
        DataSource source = new DataSource("path/to/performance_data.arff");
        Instances data = source.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);

        Classifier classifier = (Classifier) weka.core.SerializationHelper.read("path/to/model.model");
        double prediction = classifier.classifyInstance(data.instance(0));

        System.out.println("Predicted Performance: " + prediction);
    }
}

