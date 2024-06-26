import weka.classifiers.Classifier;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class CH18Example6 {
    public static void main(String[] args) throws Exception {
        DataSource source = new DataSource("path/my_maintenance_data.arff");
        Instances data = source.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);

        Classifier classifier = (Classifier) weka.core.SerializationHelper.read("path/my_maintenance_model.model");
        double prediction = classifier.classifyInstance(data.instance(0));

        if (prediction == 1.0) {
            System.out.println("Predictive Maintenance System Report (PMSR): Maintenance required soon.");
        } else {
            System.out.println("Predictive Maintenance System Report (PMSR): System is operating normally.");
        }
    }
}

