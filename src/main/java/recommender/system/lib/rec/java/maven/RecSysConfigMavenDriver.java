package recommender.system.lib.rec.java.maven;

import java.io.FileInputStream;
import java.util.Properties;

import net.librec.conf.Configuration;
import net.librec.job.RecommenderJob;
import net.librec.math.algorithm.Randoms;

public class RecSysConfigMavenDriver 
{
	/*
	 * AbstractRecommender
	 * Baseline
	 * ConstantGuessRecommender
	 * GlobalAverageRecommender
	 * MostPopularRecommender
	 * UserAverageRecommender
	 * ItemAverageRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/ConstantGuess-Baseline.properties";
	//public static String CONFIGURATION_FILE = "conf/GlobalAverage-Baseline.properties";
	//public static String CONFIGURATION_FILE = "conf/MostPopular-Baseline.properties";
	//public static String CONFIGURATION_FILE = "conf/UserAverage-Baseline.properties";
	//public static String CONFIGURATION_FILE = "conf/ItemAverage-Baseline.properties";
	
	/*
	 * ProbabilisticGraphicalRecommender
	 * Baseline
	 * UserClusterRecommender
	 * ItemClusterRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/UserCluster-Baseline.properties";
	//public static String CONFIGURATION_FILE = "conf/ItemCluster-Baseline.properties";
	
	/*
	 * ProbabilisticGraphicalRecommender
	 * Collaborative Filtering
	 * BHFreeRecommender
	 * BUCMRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/BHFree-CF.properties";
	//public static String CONFIGURATION_FILE = "conf/BUCM-CF.properties";
	
	/*
	 * AbstractRecommender
	 * Collaborative Filtering 
	 * UserKNNRecommender
	 * ItemKNNRecommender 
	 */
	//public static String CONFIGURATION_FILE = "conf/UserKNN-CF.properties";
	public static String CONFIGURATION_FILE = "conf/ItemKNN-CF.properties";
	
	/*
	 * AbstractRecommender
	 * Collaborative Filtering - Ranking
	 * SLIMRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/SLIM-CF-Ranking.properties";
	
	/*
	 * AbstractRecommender
	 * EXT
	 * AssociationRuleRecommender
	 * PersonalityDiagnosisRecommender
	 * SlopeOneRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/AssociationRule-EXT.properties";
	//public static String CONFIGURATION_FILE = "conf/PersonalityDiagnosis-EXT.properties";
	//public static String CONFIGURATION_FILE = "conf/SlopeOne-EXT.properties";
	
	/*
	 * RankSGDRecommender -> MatrixFactorizationRecommender
	 * EXT
	 * PRankDRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/PRankD-EXT.properties";
	
	/*
	 * AbstractRecommender
	 * Hybrid
	 * HybridRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/Hybrid.properties";
	
	/*
	 * MatrixFactorizationRecommender 
	 * Collaborative Filtering - Rating
	 * BiasedMFRecommender
	 * NMFRecommender
	 * RBMRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/BiasedMF-CF-Rating.properties";
	//public static String CONFIGURATION_FILE = "conf/NMF-CF-Rating.properties";
	//public static String CONFIGURATION_FILE = "conf/RBM-CF-Rating.properties";
	
	/*
	 * MatrixFactorizationRecommender 
	 * Collaborative Filtering - Ranking
	 * AoBPRRecommender
	 * BPRRecommender
	 * CLIMFRecommender
	 * EALSRecommender
	 * FISMaucRecommender
	 * FISMrmseRecommender
	 * GBPRRecommender
	 * ListRankMFRecommender
	 * RankALSRecommender
	 * RankSGDRecommender
	 * WBPRRecommender
	 * WRMFRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/AoBPR-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/BPR-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/CLIMF-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/EALS-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/FISMauc-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/FISMrmse-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/GBPR-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/ListRankMF-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/RankALS-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/RankSGD-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/WBPR-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/WRMF-CF-Ranking.properties";
	
	/*
	 * BiasedMFRecommender -> MatrixFactorizationRecommender
	 * Collaborative Filtering - Rating
	 * SVDPlusPlusRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/SVDPlusPlus-CF-Rating.properties";
	
	/*
	 * ProbabilisticGraphicalRecommender
	 * Collaborative Filtering - Ranking
	 * AspectModelRankingRecommender
	 * ItemBigramRecommender
	 * LDARecommender
	 * PLSARecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/AspectModelRanking-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/ItemBigram-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/LDA-CF-Ranking.properties";
	//public static String CONFIGURATION_FILE = "conf/PLSA-CF-Ranking.properties";
	
	/*
	 * FactorizationMachineRecommender
	 * Collaborative Filtering - Rating
	 * FMALSRecommender
	 * FMSGDRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/FMALS-CF-Rating.properties";
	//public static String CONFIGURATION_FILE = "conf/FMSGD-CF-Rating.properties";
	
	/*
	 * TensorRecommender
	 * Context - Rating
	 * BPTFRecommender
	 * PITFRecommender
	 */
	//public static String CONFIGURATION_FILE = "conf/BPTF-Context-Rating.properties";
	//public static String CONFIGURATION_FILE = "conf/PITF-Context-Rating.properties";
	
	public static void main(String[] args) throws Exception 
	{
		/*
		 * To fix log4j:WARN error
		 * https://stackoverflow.com/questions/12532339/no-appenders-could-be-found-for-loggerlog4j
		 */

		System.out.println("Configuration File Path: " + CONFIGURATION_FILE.toString() + "\n");
		
		Configuration configuration = new Configuration();
		String configurationFilePath = CONFIGURATION_FILE;
		Properties properties = new Properties();
		properties.load(new FileInputStream(configurationFilePath));
		for(String name: properties.stringPropertyNames())
		{
			configuration.set(name, properties.getProperty(name));
		}
		
		if(configurationFilePath.equals("conf/ConstantGuess-Baseline.properties"))
		{
			System.out.println("Constant Guess Recommender\n");
		}
		else if(configurationFilePath.equals("conf/GlobalAverage-Baseline.properties"))
		{
			System.out.println("Global Average Recommender\n");
		}
		else if(configurationFilePath.equals("conf/MostPopular-Baseline.properties"))
		{
			System.out.println("Most Popular Recommender\n");
		}
		else if(configurationFilePath.equals("conf/UserAverage-Baseline.properties"))
		{
			System.out.println("User Average Recommender\n");
		}
		else if(configurationFilePath.equals("conf/ItemAverage-Baseline.properties"))
		{
			System.out.println("Item Average Recommender\n");
		}
		else if(configurationFilePath.equals("conf/UserCluster-Baseline.properties"))
		{
			System.out.println("User Cluster Recommender\n");
		}
		else if(configurationFilePath.equals("conf/ItemCluster-Baseline.properties"))
		{
			System.out.println("Item Cluster Recommender\n");
		}
		else if(configurationFilePath.equals("conf/BHFree-CF.properties"))
		{
			System.out.println("BHFree Recommender\n");
		}
		else if(configurationFilePath.equals("conf/BUCM-CF.properties"))
		{
			System.out.println("BUCM Recommender\n");
		}
		else if(configurationFilePath.equals("conf/UserKNN-CF.properties"))
		{
			System.out.println("User KNN Recommender\n");
		}
		else if(configurationFilePath.equals("conf/ItemKNN-CF.properties"))
		{
			System.out.println("Item KNN Recommender\n");
		}
		else if(configurationFilePath.equals("conf/SLIM-CF-Ranking.properties"))
		{
			System.out.println("SLIM Recommender\n");
		}
		else if(configurationFilePath.equals("conf/AssociationRule-EXT.properties"))
		{
			System.out.println("Association Rule Recommender\n");
		}
		else if(configurationFilePath.equals("conf/PersonalityDiagnosis-EXT.properties"))
		{
			System.out.println("Personality Diagnosis Recommender\n");
		}
		else if(configurationFilePath.equals("conf/SlopeOne-EXT.properties"))
		{
			System.out.println("SlopeOne Recommender\n");
		}
		else if(configurationFilePath.equals("conf/PRankD-EXT.properties"))
		{
			System.out.println("PRankD Recommender\n");
		}
		else if(configurationFilePath.equals("conf/Hybrid.properties"))
		{
			System.out.println("Hybrid Recommender\n");
		}
		else if(configurationFilePath.equals("conf/BiasedMF-CF-Rating.properties"))
		{
			System.out.println("Biased MF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/NMF-CF-Rating.properties"))
		{
			System.out.println("NMF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/RBM-CF-Rating.properties"))
		{
			System.out.println("RBM Recommender\n");
		}
		else if(configurationFilePath.equals("conf/AoBPR-CF-Ranking.properties"))
		{
			System.out.println("AoBPR Recommender\n");
		}
		else if(configurationFilePath.equals("conf/BPR-CF-Ranking.properties"))
		{
			System.out.println("BPR Recommender\n");
		}
		else if(configurationFilePath.equals("conf/CLIMF-CF-Ranking.properties"))
		{
			System.out.println("CLIMF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/EALS-CF-Ranking.properties"))
		{
			System.out.println("EALS Recommender\n");
		}
		else if(configurationFilePath.equals("conf/FISMauc-CF-Ranking.properties"))
		{
			System.out.println("FISMauc Recommender\n");
		}
		else if(configurationFilePath.equals("conf/FISMrmse-CF-Ranking.properties"))
		{
			System.out.println("FISMrmse Recommender\n");
		}
		else if(configurationFilePath.equals("conf/GBPR-CF-Ranking.properties"))
		{
			System.out.println("GBPR Recommender\n");
		}
		else if(configurationFilePath.equals("conf/ListRankMF-CF-Ranking.properties"))
		{
			System.out.println("ListRankMF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/RankALS-CF-Ranking.properties"))
		{
			System.out.println("Rank ALS Recommender\n");
		}
		else if(configurationFilePath.equals("conf/RankSGD-CF-Ranking.properties"))
		{
			System.out.println("Rank SGD Recommender\n");
		}
		else if(configurationFilePath.equals("conf/WBPR-CF-Ranking.properties"))
		{
			System.out.println("WBPR Recommender\n");
		}
		else if(configurationFilePath.equals("conf/WRMF-CF-Ranking.properties"))
		{
			System.out.println("WRMF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/SVDPlusPlus-CF-Rating.properties"))
		{
			System.out.println("SVD Plus Plus Recommender\n");
		}
		else if(configurationFilePath.equals("conf/AspectModelRanking-CF-Ranking.properties"))
		{
			System.out.println("AspectModelRanking Recommender\n");
		}
		else if(configurationFilePath.equals("conf/ItemBigram-CF-Ranking.properties"))
		{
			System.out.println("ItemBigram Recommender\n");
		}
		else if(configurationFilePath.equals("conf/LDA-CF-Ranking.properties"))
		{
			System.out.println("LDA Recommender\n");
		}
		else if(configurationFilePath.equals("conf/PLSA-CF-Ranking.properties"))
		{
			System.out.println("PLSA Recommender\n");
		}
		else if(configurationFilePath.equals("conf/FMALS-CF-Rating.properties"))
		{
			System.out.println("FMALS Recommender\n");
		}
		else if(configurationFilePath.equals("conf/FMSGD-CF-Rating.properties"))
		{
			System.out.println("FMSGD Recommender\n");
		}
		else if(configurationFilePath.equals("conf/BPTF-Context-Rating.properties"))
		{
			System.out.println("BPTF Recommender\n");
		}
		else if(configurationFilePath.equals("conf/PITF-Context-Rating.properties"))
		{
			System.out.println("PITF Recommender\n");
		}
		
		Randoms.seed(20171025); 
		RecommenderJob job = new RecommenderJob(configuration);
		job.runJob();
		
		System.out.println("\nFinished Recommendation Process\n");

		System.out.println("Data Model Class: " + job.getDataModelClass());
		System.out.println("Recommender Class: " + job.getRecommenderClass());
		
		if(configurationFilePath.equals("conf/UserKNN-CF.properties") || configurationFilePath.equals("conf/ItemKNN-CF.properties"))
		{
			System.out.println("Number of KNN Neighbours: " + configuration.get("rec.neighbors.knn.number"));
			System.out.println("Similarity Class: " + job.getSimilarityClass());
			System.out.println("Filter Class: " + job.getFilterClass());
			
			if(configuration.get("rec.recommender.isranking").equals("true"))
				System.out.println("Number of Top-Ns (Ranking): " + configuration.get("rec.recommender.ranking.topn"));
		}
	}
}
