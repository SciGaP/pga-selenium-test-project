package org.apache.airavata.pga.tests;

import org.apache.airavata.pga.tests.utils.UserLogin;
import org.junit.Before;
import org.junit.Test;

/*
 **********Executing All Tests on Airavata Applications**********
 * Created by Eroma on 4/26/15.
 * The script is to execute all aApplication experiments as a bundle.
 * Updated to work with Latest PGA by Eroma 08/05/2015.
*/
public class RunAllTests extends UserLogin {
    @Before
    public void setUp() throws Exception {}

    @Test
    public void runAll() throws Exception {
        System.out.println("============== Running all tests ==================");

        long startTime = System.nanoTime();

//       System.out.println("Starting CreateModifySearchProject ...");
//        CreateModifySearchProject t0 = new CreateModifySearchProject();
//        t0.setUp();
//        t0.testCreateModifySearchProject();
//        t0.tearDown();
//        System.out.println("CreateModifySearchProject - Done");

        int iterations1 = 1;
        for (int i=0; i < iterations1; ++i) {

       System.out.println("Starting AbinitBR2 ...");
        AbinitBR2 t23 = new AbinitBR2();
        t23.setUp();
        t23.testAbinitBR2();
        t23.tearDown();
        System.out.println("AbinitBR2 - Done");


//        System.out.println("Starting AbinitComet ...");
//        AbinitComet t30 = new AbinitComet();
//        t30.setUp();
//        t30.testAbinitComet();
//        t30.tearDown();
//        System.out.println("AbinitComet - Done");


        System.out.println("Starting AmberSanderBR2 ...");
        AmberSanderBR2 t1 = new AmberSanderBR2();
        t1.setUp();
        t1.testAmberSanderBR2();
        t1.tearDown();
        System.out.println("AmberSanderBR2 - Done");


//        System.out.println("Starting AmberSanderComet ...");
//        AmberSanderComet t2 = new AmberSanderComet();
//        t2.setUp();
//        t2.testAmberSanderComet();
//        t2.tearDown();
//        System.out.println("AmberSanderComet - Done");

        System.out.println("Starting AmberSanderStampede ...");
        AmberSanderStampede t3 = new AmberSanderStampede();
        t3.setUp();
        t3.testAmberSanderStampede();
        t3.tearDown();
        System.out.println("AmberSanderStampede - Done");


        System.out.println("Starting AutoDockBR2 ...");
        AutoDockBR2 t4 = new AutoDockBR2();
        t4.setUp();
        t4.testAutoDockBR2();
        t4.tearDown();
        System.out.println("AutoDockBR2 - Done");


//        System.out.println("Starting CP2KComet ...");
//        CP2KComet t24 = new CP2KComet();
//        t24.setUp();
//        t24.testCP2KComet();
//        t24.tearDown();
//        System.out.println("CP2KComet - Done");

        System.out.println("Starting CP2KStampede ...");
        CP2KStampede t21 = new CP2KStampede();
        t21.setUp();
        t21.testCP2KStampede();
        t21.tearDown();
        System.out.println("CP2KStampede - Done");

//        System.out.println("Starting CPMDComet ...");
//        CPMDComet t33 = new CPMDComet();
//        t33.setUp();
//        t33.testCPMDComet();
//        t33.tearDown();
//        System.out.println("CPMDComet - Done");


        /*System.out.println("Starting EchoBR2 ...");
        EchoBR2 t5 = new EchoBR2();
        t5.setUp();
        t5.testEchoBR2();
        t5.tearDown();
        System.out.println("EchoBR2 - Done");

        System.out.println("Starting EchoComet...");
        EchoComet t6 = new EchoComet();
        t6.setUp();
        t6.testEchoComet();
        t6.tearDown();
        System.out.println("EchoComet - Done");

        System.out.println("Starting EchoStampede ...");
        EchoStampede t7 = new EchoStampede();
        t7.setUp();
        t7.testEchoStampede();
        t7.tearDown();
        System.out.println("EchoStampede - Done");*/

        System.out.println("Starting QuantumEspressoStampede ...");
        QuantumEspressoStampede t8 = new QuantumEspressoStampede();
        t8.setUp();
        t8.testQuantumEspressoStampede();
        t8.tearDown();
        System.out.println("QuantumEspressoStampede - Done");

        System.out.println("Starting GamessGordon ...");
        GamessGordon t9 = new GamessGordon();
        t9.setUp();
        t9.testGamessGordon();
        t9.tearDown();
        System.out.println("GamessGordon - Done");

//        System.out.println("Starting GaussianComet ...");
//        GaussianComet t10 = new GaussianComet();
//        t10.setUp();
//        t10.testGaussianComet();
//        t10.tearDown();
//        System.out.println("GaussianComet - Done");

        System.out.println("Starting GaussianGordon ...");
        GaussianGordon t11 = new GaussianGordon();
        t11.setUp();
        t11.testGaussianGordon();
        t11.tearDown();
        System.out.println("GaussianGordon - Done");

        System.out.println("Starting GromacsStampede ...");
        GromacsStampede t12 = new GromacsStampede();
        t12.setUp();
        t12.testGromacsStampede();
        t12.tearDown();
        System.out.println("GromacsStampede - Done");

//        System.out.println("Starting LammpsComet ...");
//        LammpsComet t13 = new LammpsComet();
//        t13.setUp();
//        t13.testLammpsComet();
//        t13.tearDown();
//        System.out.println("LammpsComet - Done");

        System.out.println("Starting LammpsStampede ...");
        LammpsStampede t14 = new LammpsStampede();
        t14.setUp();
        t14.testLammpsStampede();
        t14.tearDown();
        System.out.println("LammpsStampede - Done");

//        System.out.println("Starting NwChemComet ...");
//        NwChemComet t15 = new NwChemComet();
//        t15.setUp();
//        t15.testNwChemComet();
//        t15.tearDown();
//        System.out.println("NwChemComet - Done");

        System.out.println("Starting NwChemStampede ...");
        NwChemStampede t16 = new NwChemStampede();
        t16.setUp();
        t16.testNwChemStampede();
        t16.tearDown();
        System.out.println("NwChemStampede - Done");

//        System.out.println("Starting PhastaPStampede ...");
//        PhastaPStampede t17 = new PhastaPStampede();
//        t17.setUp();
//        t17.testPhastaPStampede();
//        t17.tearDown();
//        System.out.println("PhastaPStampede - Done");

        System.out.println("Starting TinkerMonteStampede ...");
        TinkerMonteStampede t18 = new TinkerMonteStampede();
        t18.setUp();
        t18.testTinkerMonteStampede();
        t18.tearDown();
        System.out.println("TinkerMonteStampede - Done");

//        System.out.println("Starting WRFStampede ...");
//        WRFStampede t20 = new WRFStampede();
//        t20.setUp();
//        t20.testWRFStampede();
//        t20.tearDown();
//        System.out.println("WRFStampede - Done");
//
//        System.out.println("Starting QuantumEspressoComet ...");
//        QuantumEspressoComet t22 = new QuantumEspressoComet();
//        t22.setUp();
//        t22.testQuantumEspressoComet();
//        t22.tearDown();
//        System.out.println("QuantumEspressoComet - Done");

        System.out.println("Starting GamessBR2 ...");
        GamessBR2 t25 = new GamessBR2();
        t25.setUp();
        t25.testGamessBR2();
        t25.tearDown();
        System.out.println("GamessBR2 - Done");

        System.out.println("Starting GaussianBR2 ...");
        GaussianBR2 t26 = new GaussianBR2();
        t26.setUp();
        t26.testGaussianBR2();
        t26.tearDown();
        System.out.println("GaussianBR2 - Done");

        System.out.println("Starting GromacsBR2 ...");
        GromacsBR2 t27 = new GromacsBR2();
        t27.setUp();
        t27.testGromacsBR2();
        t27.tearDown();
        System.out.println("GromacsBR2 - Done");

        System.out.println("Starting LammpsBR2 ...");
        LammpsBR2 t28 = new LammpsBR2();
        t28.setUp();
        t28.testLammpsBR2();
        t28.tearDown();
        System.out.println("LammpsBR2 - Done");

        System.out.println("Starting CP2KStampede ...");
        CP2KStampede t31 = new CP2KStampede();
        t31.setUp();
        t31.testCP2KStampede();
        t31.tearDown();
        System.out.println("CP2KStampede - Done");
//
//        System.out.println("Starting DDSCatComet ...");
//        DDSCatComet t34 = new DDSCatComet();
//        t34.setUp();
//        t34.testDDSCatComet();
//        t34.tearDown();
//        System.out.println("DDSCatComet - Done");
//
//        System.out.println("Starting GamessComet ...");
//        GamessComet t35 = new GamessComet();
//        t35.setUp();
//        t35.testGamessComet();
//        t35.tearDown();
//        System.out.println("GamessComet - Done");


        System.out.println("Starting GamessStampede ...");
        GamessStampede t36 = new GamessStampede();
        t36.setUp();
        t36.testGamessStampede();
        t36.tearDown();
        System.out.println("GamessStampede - Done");

//        System.out.println("Starting GromacsComet ...");
//        GromacsComet t37 = new GromacsComet();
//        t37.setUp();
//        t37.testGromacsComet();
//        t37.tearDown();
//        System.out.println("GromacsComet - Done");

        System.out.println("Starting LammpsGordon ...");
        LammpsGordon t38 = new LammpsGordon();
        t38.setUp();
        t38.testLammpsGordon();
        t38.tearDown();
        System.out.println("LammpsGordon - Done");

//        System.out.println("Starting QChemComet ...");
//        QChemComet t40 = new QChemComet();
//        t40.setUp();
//        t40.testQChemComet();
//        t40.tearDown();
//        System.out.println("QChemComet - Done");

//         System.out.println("Starting AbaqusComet ...");
//         AbaqusComet t41 = new AbaqusComet();
//         t41.setUp();
//         t41.testAbaqusComet();
//         t41.tearDown();
//         System.out.println("AbaqusComet - Done");

         System.out.println("Starting DFTBStampede ...");
         DFTBStampede t42 = new DFTBStampede();
         t42.setUp();
         t42.testDFTBStampede();
         t42.tearDown();
         System.out.println("DFTBStampede - Done");

         System.out.println("Starting MolcasStampede ...");
         MolcasStampede t43 = new MolcasStampede();
         t43.setUp();
         t43.testMolcasStampede();
         t43.tearDown();
         System.out.println("MolcasStampede - Done");

        /* System.out.println("Starting QuantumEspressoLonestar ...");
         QuantumEspressoLonestar t44 = new QuantumEspressoLonestar();
         t44.setUp();
         t44.testQuantumEspressoLonestar();
         t44.tearDown();
         System.out.println("QuantumEspressoLonestar - Done");

         System.out.println("Starting EchoLonestar...");
         EchoLonestar t45 = new EchoLonestar();
         t45.setUp();
         t45.testEchoLonestar();
         t45.tearDown();
         System.out.println("EchoLonestar - Done");*/

        System.out.println("Starting NEK5000BR2 ...");
        NEK5000BR2 t46 = new NEK5000BR2();
        t46.setUp();
        t46.testNEK5000BR2();
        t46.tearDown();
        System.out.println("NEK5000BR2 - Done");

        System.out.println("Starting AutoDockVinaStampede ...");
        AutoDockVinaStampede t47 = new AutoDockVinaStampede();
        t47.setUp();
        t47.testAutoDockVinaStampede();
        t47.tearDown();
        System.out.println("AutoDockVinaStampede - Done");

        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Time to execute Experiment Tests "
                + " : " + (duration / 1000000000) / 60 + " minutes.");

        System.out.println("==================== Done =========================");

    }
}
