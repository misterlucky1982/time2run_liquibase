package by.irun.time2run_liquibase;

import by.misterlucky.liquibase.LiquibaseDefaultVariables;
import by.misterlucky.liquibase.LiquibaseRunner;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		LiquibaseRunner lRunner = new LiquibaseRunner();
		lRunner.applyFile("src/changeLog.xml");
		lRunner.applyLogin("postgres");
		lRunner.applyPassword("gfhjkm");
		lRunner.applyUrl("jdbc:postgresql://localhost/time2run");
		lRunner.applyExequtionLevel(LiquibaseDefaultVariables.PRPODUCTION_REQUIRENMENT_LEVEL);
		lRunner.applyExequtionLevel(LiquibaseDefaultVariables.DEVELOPMENT_REQUIRENMENT_LEVEL);
		lRunner.applyExequtionLevel(LiquibaseDefaultVariables.TEST_REQUIRENMENT_LEVEL);
		lRunner.init();
		lRunner.runScripts();
    }
}
